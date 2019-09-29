/**
 * 
 */
package com.jaggs.jgcodeassist.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jaggs.jgcodeassist.domain.Customer;

/**
 * @author jaggsosx
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
