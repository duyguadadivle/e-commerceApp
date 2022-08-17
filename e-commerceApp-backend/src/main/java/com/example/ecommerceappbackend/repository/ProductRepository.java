package com.example.ecommerceappbackend.repository;

import com.example.ecommerceappbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

   //List<Product> findByName( String name);
   //Optional<Product> findById( Long id);

   List<Product> findByCategoryName( String CategoryName);




}