package com.geniusee.task.cinema.repository;

import com.geniusee.task.cinema.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
