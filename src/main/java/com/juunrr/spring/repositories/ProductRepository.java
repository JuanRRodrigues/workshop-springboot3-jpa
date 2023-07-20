package com.juunrr.spring.repositories;

import com.juunrr.spring.entities.Product;
import com.juunrr.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
