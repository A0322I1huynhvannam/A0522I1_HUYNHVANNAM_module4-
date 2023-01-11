package com.example.blognew.service.impl;
import com.example.blognew.model.Category;
import com.example.blognew.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
     categoryRepository.save( category );
    }

    @Override
    public void update(int id, Category category) {
       Category category1 = findByIdMy( id );
       categoryRepository.save( category1 );
    }

    @Override
    public Category findByIdMy(int id) {
      return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
      categoryRepository.deleteById( id );
    }
}
