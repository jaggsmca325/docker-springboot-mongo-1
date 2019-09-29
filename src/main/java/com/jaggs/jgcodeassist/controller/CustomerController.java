/**
 * 
 */
package com.jaggs.jgcodeassist.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jaggs.jgcodeassist.converters.CustomerToCustomerForm;
import com.jaggs.jgcodeassist.domain.Customer;
import com.jaggs.jgcodeassist.forms.CustomerForm;
import com.jaggs.jgcodeassist.service.CustomerService;

/**
 * @author jaggsosx
 *
 */
@Controller
public class CustomerController {
	
	private CustomerService customerService;
	private CustomerToCustomerForm customerToCustomerForm;
	
	/**
	 * @param customerService the customerService to set
	 */
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * @param customerToCustomerForm the customerToCustomerForm to set
	 */
	@Autowired
	public void setCustomerToCustomerForm(CustomerToCustomerForm customerToCustomerForm) {
		this.customerToCustomerForm = customerToCustomerForm;
	}
	
//	@RequestMapping("/")
//    public String redirToList(){
//        return "redirect:/customer/list";
//    }
	
	
	@RequestMapping({"/customer/list", "/cutomer"})
    public String listCustomers(Model model){
        model.addAttribute("customers", customerService.listAll());
        return "customer/list";
    }
	
	@RequestMapping("/customer/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("customer", customerService.getById(id));
        return "customer/show";
    }
	
	@RequestMapping("customer/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Customer customer = customerService.getById(id);
        CustomerForm customerForm = customerToCustomerForm.convert(customer);

        model.addAttribute("customerForm", customerForm);
        return "customer/customerform";
    }
	
	@RequestMapping("/customer/new")
    public String newCustomer(Model model){
        model.addAttribute("customerForm", new CustomerForm());
        return "customer/customerform";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String saveOrUpdateCustomer(@Valid CustomerForm customerForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "customer/customerform";
        }

        Customer savedCustomer = customerService.saveOrUpdateCustomerForm(customerForm);

        //return "redirect:/customer/show/" + savedCustomer.getId();
        
        return "redirect:customer/list";
    }

    @RequestMapping("/customer/delete/{id}")
    public String delete(@PathVariable String id){
        customerService.delete(id);
        return "redirect:/customer/list";
    }
    
    
	

}
