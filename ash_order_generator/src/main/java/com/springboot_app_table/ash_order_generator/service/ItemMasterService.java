package com.springboot_app_table.ash_order_generator.service;

import com.springboot_app_table.ash_order_generator.model.ItemMaster;
import com.springboot_app_table.ash_order_generator.repository.ItemMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemMasterService {
    @Autowired
    private ItemMasterRepository repository;

    public List<ItemMaster> getAllItems() {
        return repository.findAll();
    }

    public ItemMaster saveItem(ItemMaster item) {
        return repository.save(item);
    }
}
