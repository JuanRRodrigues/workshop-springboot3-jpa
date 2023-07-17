package com.juunrr.spring.repositories;

import com.juunrr.spring.entities.Category;
import com.juunrr.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
