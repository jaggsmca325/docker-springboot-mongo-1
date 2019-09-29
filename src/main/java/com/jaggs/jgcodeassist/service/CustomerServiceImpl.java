/**
 * 
 */
package com.jaggs.jgcodeassist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaggs.jgcodeassist.converters.CustomerFormToCustomer;
import com.jaggs.jgcodeassist.domain.Customer;
import com.jaggs.jgcodeassist.forms.CustomerForm;
import com.jaggs.jgcodeassist.repositories.CustomerRepository;

/**
 * @author jaggsosx
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepo;
	private CustomerFormToCustomer customerFormToCustomer;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepo, CustomerFormToCustomer customerFormToCustomer) {
		super();
		this.customerRepo = customerRepo;
		this.customerFormToCustomer = customerFormToCustomer;
	}

	@Override
	public List<Customer> listAll() {
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerRepo.findAll().forEach(customerList::add);
		return customerList;
	}

	@Override
	public Customer getById(String id) {
		
		return customerRepo.findById(id).orElse(null);
	}

	@Override
	public Customer saveOrUpdate(Customer customer) {

		customerRepo.save(customer);
		return customer;
	}

	@Override
	public void delete(String id) {
		customerRepo.deleteById(id);
		

	}

	@Override
	public Customer saveOrUpdateCustomerForm(CustomerForm customerForm) {

		Customer customer = this.saveOrUpdate(customerFormToCustomer.convert(customerForm));
		System.out.println("CustomerServiceImpl.saveOrUpdateCustomerForm(): Saved Customer ID: " + customer.getId());
		return customer;
	}

}
