package com.example.furama.service;

import com.example.furama.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    void create(Customer customer);
    void update(Customer customer);
    void delete(Integer id);
    List<Customer> findAll();
    Customer findById(Integer id);
    Page<Customer> findAllWithPaging(Pageable pageable);
}
