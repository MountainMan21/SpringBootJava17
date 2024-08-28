package com.springboot_app_table.ash_order_processor.controller;


import com.springboot_app_table.ash_order_processor.model.Order;
import com.springboot_app_table.ash_order_processor.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.saveOrder(order);
    }
}

