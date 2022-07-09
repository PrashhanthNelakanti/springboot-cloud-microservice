package com.prashhanth.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBackMethod() {
        return "Product Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/inventoryServiceFallBack")
    public String inventoryServiceFallBackMethod() {
        return "Inventory Service is taking longer than Expected." +
                " Please try again later";
    }
}
