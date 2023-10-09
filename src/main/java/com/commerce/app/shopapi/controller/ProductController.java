package com.commerce.app.shopapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.app.shopapi.model.Product;
import com.commerce.app.shopapi.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // create product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }
}
