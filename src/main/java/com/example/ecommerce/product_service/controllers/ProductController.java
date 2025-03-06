package com.example.ecommerce.product_service.controllers;

import com.example.ecommerce.product_service.entities.Product;
import com.example.ecommerce.product_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello From Product-Service";
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return "Product is created";
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
