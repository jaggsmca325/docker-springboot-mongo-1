package com.jaggs.jgcodeassist.services;


import java.util.List;

import com.jaggs.jgcodeassist.commands.ProductForm;
import com.jaggs.jgcodeassist.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
