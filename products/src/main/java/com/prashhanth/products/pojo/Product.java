package com.prashhanth.products.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    private Integer productId;
    private String pname;
    private String brand;
    private Date lastUpdated;
}
