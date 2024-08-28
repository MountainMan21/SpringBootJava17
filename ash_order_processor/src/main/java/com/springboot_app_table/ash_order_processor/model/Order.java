package com.springboot_app_table.ash_order_processor.model;
/*
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer totalCost;

    @Column(nullable = false)
    private LocalDate date;

    public void setTotalCost(int totalCost) {
    }

    public int getQuantity() {
        return 0;
    }

    public String getItemId() {
        return null;
    }
    */


    // Getters and setters


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "orders") // Changed to a non-reserved keyword
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;


    private String item;
    private Integer quantity;
    private Integer totalCost;
    private LocalDate date;

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
// Getters and setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemId() {
        return null;
    }
}

