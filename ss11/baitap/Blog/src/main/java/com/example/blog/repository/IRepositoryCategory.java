package com.example.blog.repository;

import com.example.blog.model.CategoryBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRepositoryCategory extends JpaRepository<CategoryBlog,Integer> {
    @Modifying
    @Query("SELECT c.blogs from category c where c.idCategory = :id")
    List<CategoryBlog> selectIntoBlog(@Param("id") Integer id);
}
