package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface IServiceBlog {
    List<Blog> findAll();

    Blog findById(Integer id);

    void create(Blog blog);

    void update(Blog blog);

    void deleteById(Integer id);

    List<Blog> listQueryCategory(Integer id);
    List<Blog> search(String name);
}
