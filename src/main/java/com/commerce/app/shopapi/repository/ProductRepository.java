package com.commerce.app.shopapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.app.shopapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
