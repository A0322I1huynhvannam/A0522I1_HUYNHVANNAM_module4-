package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {
    List<Blog> getAll();
    void save(Blog blog);
    void update(int id,Blog blog);
    Blog findByIdMy(int id);
    void deleteById(int id);
}
