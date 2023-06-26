package com.juunrr.spring.repositories;

import com.juunrr.spring.entities.Order;
import com.juunrr.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
