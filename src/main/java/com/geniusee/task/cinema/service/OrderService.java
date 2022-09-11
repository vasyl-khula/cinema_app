package com.geniusee.task.cinema.service;

import com.geniusee.task.cinema.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    Order getOrder(UUID id);

    List<Order> getAllOrders();

    Order createOrder(Order order);

    Order updateOrder(Order order);

    void deleteOrder(UUID id);
}
