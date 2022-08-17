package com.example.ecommerceappbackend.service;

import com.example.ecommerceappbackend.model.Product;
import com.example.ecommerceappbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    //@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductList(){
        return productRepository.findAll(); }

    @Override
    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findByCategoryName( String categoryName){
        return productRepository.findByCategoryName(categoryName);
    }

    @Override
    public void deleteProduct(Long Id) {
        productRepository.deleteById(Id);
    }



}
