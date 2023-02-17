package com.example.product.service.impl;

import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public Page<Product> getAll(PageRequest pageRequest) {
        return productRepository.findAll(pageRequest);
    }

    @Override
    public void create(Product product) {
     productRepository.save( product );
    }

    @Override
    public void update(Product product) {
     productRepository.save( product );
    }

    @Override
    public void delete(Product product) {
     productRepository.delete( product );
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById( id ).orElse( new Product() );
    }
}
