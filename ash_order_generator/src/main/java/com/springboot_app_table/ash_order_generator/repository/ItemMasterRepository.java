package com.springboot_app_table.ash_order_generator.repository;

import com.springboot_app_table.ash_order_generator.model.ItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMasterRepository extends JpaRepository<ItemMaster, Long> {
}
