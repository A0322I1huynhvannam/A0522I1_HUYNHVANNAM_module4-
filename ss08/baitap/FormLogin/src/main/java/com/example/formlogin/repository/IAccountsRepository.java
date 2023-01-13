package com.example.formlogin.repository;

import com.example.formlogin.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountsRepository extends JpaRepository<Accounts,Integer> {
}
