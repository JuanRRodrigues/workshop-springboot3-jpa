package com.juunrr.spring.repositories;

import com.juunrr.spring.entities.OrderItem;
import com.juunrr.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
