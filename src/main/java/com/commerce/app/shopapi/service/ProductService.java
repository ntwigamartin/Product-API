package com.commerce.app.shopapi.service;

import java.util.List;

import com.commerce.app.shopapi.model.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
