package com.example.furama.service.impl;

import com.example.furama.model.CustomerType;
import com.example.furama.repository.ICustomerTypeRepo;
import com.example.furama.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepo customerTypeRepo;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepo.findAll();
    }
}
