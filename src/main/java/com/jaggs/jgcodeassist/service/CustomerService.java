/**
 * 
 */
package com.jaggs.jgcodeassist.service;

import java.util.List;

import com.jaggs.jgcodeassist.domain.Customer;
import com.jaggs.jgcodeassist.forms.CustomerForm;


/**
 * @author jaggsosx
 *
 */
public interface CustomerService {

    List<Customer> listAll();

    Customer getById(String id);

    Customer saveOrUpdate(Customer customer);

    void delete(String id);

    Customer saveOrUpdateCustomerForm(CustomerForm customerForm);


}
