package com.prashhanth.ims.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private  Integer productId;
    private String pname;
    private String brand;
    private Date lastUpdated;
}
