package com.example.formlogin.service;

import com.example.formlogin.model.Accounts;

import java.util.List;

public interface IAccountService {
    void create(Accounts accounts);
    List<Accounts> getAll();
}
