package com.prashhanth.products.repo;

import com.prashhanth.products.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    public Product findProductByProductId(Integer id);
}
