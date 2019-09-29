package com.jaggs.jgcodeassist.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.jaggs.jgcodeassist.domain.Customer;
import com.jaggs.jgcodeassist.forms.CustomerForm;

@Component
public class CustomerToCustomerForm implements Converter<Customer, CustomerForm> {
    @Override
    public CustomerForm convert(Customer customer) {
        CustomerForm customerForm = new CustomerForm();
        customerForm.setId(customer.getId().toHexString());
       
        customerForm.setAddress(customer.getAddress());
        customerForm.setCustomerfName(customer.getCustomerfName());
        customerForm.setCustomerlName(customer.getCustomerlName());
        customerForm.setEmail(customer.getEmail());
        customerForm.setPhoneNumber(customer.getPhoneNumber());
        
        return customerForm;
    }
}
