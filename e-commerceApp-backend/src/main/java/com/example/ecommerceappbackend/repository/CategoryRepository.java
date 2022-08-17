package com.example.ecommerceappbackend.repository;

import com.example.ecommerceappbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    //List<Category> findByName(@Param("name") String name);
}