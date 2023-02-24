package com.example.blogexpanse.repository;

import com.example.blogexpanse.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByAccountName(String accountName);
}
