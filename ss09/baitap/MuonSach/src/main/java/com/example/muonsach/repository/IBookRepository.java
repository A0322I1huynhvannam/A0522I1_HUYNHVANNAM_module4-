package com.example.muonsach.repository;

import com.example.muonsach.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBookRepository extends PagingAndSortingRepository<Book, Integer> {
    Book findById(int id);

    Page<Book> findByName(String name, Pageable pageable);
}
