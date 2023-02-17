package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Page<Product> getAll(PageRequest pageRequest);

    void create(Product product) ;

    void update(Product product) ;

    void delete(Product product) ;

    Product findById(int id) ;
}
