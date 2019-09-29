package com.jaggs.jgcodeassist.converters;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.jaggs.jgcodeassist.domain.Customer;
import com.jaggs.jgcodeassist.forms.CustomerForm;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class CustomerFormToCustomer implements Converter<CustomerForm, Customer> {

    @Override
    public Customer convert(CustomerForm customerForm) {
        Customer customer = new Customer();
        if (customerForm.getId() != null  && !StringUtils.isEmpty(customerForm.getId())) {
            customer.setId(new ObjectId(customerForm.getId()));
        }
        
        customer.setAddress(customerForm.getAddress());
        customer.setCustomerfName(customerForm.getCustomerfName());
        customer.setCustomerlName(customerForm.getCustomerlName());
        customer.setEmail(customerForm.getEmail());
        customer.setPhoneNumber(customerForm.getPhoneNumber());
        
        return customer;
    }
}
