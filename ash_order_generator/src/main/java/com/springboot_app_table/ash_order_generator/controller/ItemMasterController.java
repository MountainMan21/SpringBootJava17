package com.springboot_app_table.ash_order_generator.controller;

import com.springboot_app_table.ash_order_generator.model.ItemMaster;
import com.springboot_app_table.ash_order_generator.service.ItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemMasterController {
    @Autowired
    private ItemMasterService service;

    @GetMapping
    public List<ItemMaster> getItems() {
        return service.getAllItems();
    }

    @PostMapping
    public ItemMaster addItem(@RequestBody ItemMaster item) {
        return service.saveItem(item);
    }
}
