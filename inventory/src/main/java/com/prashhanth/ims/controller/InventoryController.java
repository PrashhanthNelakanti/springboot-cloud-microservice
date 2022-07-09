package com.prashhanth.ims.controller;

import com.prashhanth.ims.dto.InventoryDto;
import com.prashhanth.ims.pojo.Inventory;
import com.prashhanth.ims.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/")
    public Inventory addInventory(@RequestBody Inventory inventory){
        return inventoryService.addInventory(inventory);
    }

    @GetMapping("/{pid}")
    public InventoryDto getInventoryById(@PathVariable("pid") Integer pid){
        return inventoryService.getInventoryByID(pid);
    }
}
