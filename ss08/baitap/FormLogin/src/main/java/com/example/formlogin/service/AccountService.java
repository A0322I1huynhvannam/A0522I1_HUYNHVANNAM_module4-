package com.example.formlogin.service;

import com.example.formlogin.model.Accounts;
import com.example.formlogin.repository.IAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{
    @Autowired
    IAccountsRepository accountsRepository;
    @Override
    public void create(Accounts accounts) {
      accountsRepository.save( accounts );
    }

    @Override
    public List<Accounts> getAll() {
        return accountsRepository.findAll();
    }
}
