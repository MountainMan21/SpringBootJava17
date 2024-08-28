package com.springboot_app_table.ash_order_processor.service;

import com.springboot_app_table.ash_order_generator.model.ItemMaster;
import com.springboot_app_table.ash_order_processor.model.Order;
import com.springboot_app_table.ash_order_processor.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;


    @Autowired
    private RestTemplate restTemplate;


    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order saveOrder(Order order) {
        // Assuming you want to fetch item cost from the item-master service
        ItemMaster item = restTemplate.getForObject("http://item-master-service/items/" + order.getItemId(), ItemMaster.class);
        int totalCost = item.getItemCost() * order.getQuantity();
        order.setTotalCost(totalCost);
        return repository.save(order);
    }




}



