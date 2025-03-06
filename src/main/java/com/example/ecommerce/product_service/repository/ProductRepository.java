package com.example.ecommerce.product_service.repository;

import com.example.ecommerce.product_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
