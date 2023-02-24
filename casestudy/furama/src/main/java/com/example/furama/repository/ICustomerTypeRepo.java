package com.example.furama.repository;

import com.example.furama.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepo extends JpaRepository<CustomerType,Integer> {
}
