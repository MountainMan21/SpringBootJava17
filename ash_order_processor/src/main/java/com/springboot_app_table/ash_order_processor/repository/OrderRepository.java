package com.springboot_app_table.ash_order_processor.repository;

import com.springboot_app_table.ash_order_processor.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
