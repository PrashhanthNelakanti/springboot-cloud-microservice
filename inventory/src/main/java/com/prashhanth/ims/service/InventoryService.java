package com.prashhanth.ims.service;

import com.prashhanth.ims.dto.InventoryDto;
import com.prashhanth.ims.dto.Product;
import com.prashhanth.ims.pojo.Inventory;
import com.prashhanth.ims.repo.InventoryRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;

    @Autowired
    private RestTemplate restTemplate;

    public List<Inventory> getInventory(){
        return inventoryRepo.findAll();
    }

    public Inventory addInventory(Inventory inventory){
        return inventoryRepo.save(inventory);
    }

    public Inventory updateInventory(Inventory inventory){
       Inventory persistObj= inventoryRepo.findAllByInventoryId(inventory.getInventoryId());
       persistObj.setPid(inventory.getInventoryId());
       persistObj.setQty(inventory.getQty());
       persistObj.setCountry(inventory.getCountry());
        return inventoryRepo.save(persistObj);
    }

    public InventoryDto getInventoryByID(Integer pid){
        Inventory persistObj= inventoryRepo.findInventoryByPid(pid);
        Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + pid, Product.class);
        InventoryDto inventoryDto = new InventoryDto(product,persistObj);
        return inventoryDto;
    }
}
