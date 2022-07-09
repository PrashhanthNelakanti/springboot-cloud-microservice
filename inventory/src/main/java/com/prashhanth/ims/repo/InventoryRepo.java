package com.prashhanth.ims.repo;

import com.prashhanth.ims.pojo.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Integer> {

    public Inventory findAllByInventoryId(Integer id);
    public  Inventory findInventoryByPid(Integer pid);
}
