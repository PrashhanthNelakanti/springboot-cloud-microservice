package com.prashhanth.products.service;

import com.prashhanth.products.pojo.Product;
import com.prashhanth.products.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Product product) {
        Product persistedProduct = productRepo.findProductByProductId(product.getProductId());
        persistedProduct.setPname(product.getPname());
        persistedProduct.setLastUpdated(new Date());
        persistedProduct.setBrand(product.getBrand());
        persistedProduct.setPname(product.getPname());
        return productRepo.save(persistedProduct);
    }

    public String deleteProduct(Integer pid) {
        Product product = productRepo.findProductByProductId(pid);
        productRepo.delete(product);
        return "Product Deleted with Id:"+pid;
    }

    public Product getAllProductById(Integer pid) {
        return productRepo.findProductByProductId(pid);
    }
}
