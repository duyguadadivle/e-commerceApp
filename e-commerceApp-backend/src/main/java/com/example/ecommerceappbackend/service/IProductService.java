package com.example.ecommerceappbackend.service;

import com.example.ecommerceappbackend.model.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);
    List<Product> getProductList();
    Product findById(Long id);
    List<Product> findByCategoryName(String categoryName);

    void deleteProduct(Long Id);

}
