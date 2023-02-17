package com.example.blog.service;

import com.example.blog.model.CategoryBlog;

import java.util.List;

public interface IServiceCategory {
    List<CategoryBlog> findAll();

    CategoryBlog findById(Integer id);

    void create(CategoryBlog categoryBlog);

    void update(CategoryBlog categoryBlog);

    void deleteById(Integer id);
    List<CategoryBlog> findIDCategory(Integer id);
}
