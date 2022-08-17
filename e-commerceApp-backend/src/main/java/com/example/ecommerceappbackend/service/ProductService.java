package com.example.ecommerceappbackend.service;

import com.example.ecommerceappbackend.model.Product;
import com.example.ecommerceappbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProductList(){
        return productRepository.findAll(); }
    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    public List<Product> findByCategoryName( String CategoryName){
        return productRepository.findByCategoryName(CategoryName);
    }

    public void deleteProduct(Long Id) {
        productRepository.deleteById(Id);
    }
}
