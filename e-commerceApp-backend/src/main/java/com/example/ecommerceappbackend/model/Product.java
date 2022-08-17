package com.example.ecommerceappbackend.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Double price;

    private String imagePath;

    private String categoryName;

    private String description;

    public Product(String name, Double price, String imagePath, String categoryName, String description) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
        this.categoryName = categoryName;
        this.description = description;
    }

    public Product() {

    }
}