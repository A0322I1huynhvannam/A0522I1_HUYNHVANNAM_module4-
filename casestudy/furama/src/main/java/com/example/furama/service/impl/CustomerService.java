package com.example.furama.service.impl;

import com.example.furama.model.Customer;
import com.example.furama.repository.ICustomerRepo;
import com.example.furama.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepo customerRepo;


    @Override
    public void save(Customer customer) {
        customerRepo.save( customer );
    }

    @Override
    public void delete(Integer id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findAllWithPaging(Pageable pageable) {
        return customerRepo.findAll(pageable);
    }
}
