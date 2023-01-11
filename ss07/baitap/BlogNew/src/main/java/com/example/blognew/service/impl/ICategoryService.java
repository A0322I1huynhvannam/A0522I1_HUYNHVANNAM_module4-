package com.example.blognew.service.impl;

import com.example.blognew.model.Blog;
import com.example.blognew.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAll();
    void save(Category category);
    void update(int id,Category category);


    Category findByIdMy(int id);
    void deleteById(int id);
}
