package com.juunrr.spring.services;

import com.juunrr.spring.entities.Category;
import com.juunrr.spring.entities.User;
import com.juunrr.spring.repositories.CategoryRepository;
import com.juunrr.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
