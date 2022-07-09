package com.prashhanth.ims.dto;

import com.prashhanth.ims.pojo.Inventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class InventoryDto  {
    private Product product;
    private Inventory inventory;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public InventoryDto(Product product, Inventory inventory) {
        this.product = product;
        this.inventory = inventory;
    }
}
