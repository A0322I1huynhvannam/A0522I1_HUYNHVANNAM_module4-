package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository  extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product",nativeQuery = true)
    Page<Product> findAll (Pageable pageable);
    //    @Query(value = "select * from product s where s.name like ?1;",nativeQuery = true)
//    List<Product> findByNameContainingOrDescriptionContaining (String nameProduct);
    List<Product> findAllByNameProductContains(String nameProduct);
}
