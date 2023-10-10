package com.commerce.app.shopapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.commerce.app.shopapi.model.Product;
import com.commerce.app.shopapi.repository.ProductRepository;
import com.commerce.app.shopapi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
}
