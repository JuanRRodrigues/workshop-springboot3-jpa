package com.juunrr.spring.services;

import com.juunrr.spring.entities.Order;
import com.juunrr.spring.entities.User;
import com.juunrr.spring.repositories.OrderRepository;
import com.juunrr.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
