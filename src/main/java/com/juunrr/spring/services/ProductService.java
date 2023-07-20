package com.juunrr.spring.services;

import com.juunrr.spring.entities.Product;
import com.juunrr.spring.entities.User;
import com.juunrr.spring.repositories.ProductRepository;
import com.juunrr.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
