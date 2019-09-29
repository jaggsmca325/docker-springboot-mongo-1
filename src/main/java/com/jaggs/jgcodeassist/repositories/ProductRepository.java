package com.jaggs.jgcodeassist.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jaggs.jgcodeassist.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
