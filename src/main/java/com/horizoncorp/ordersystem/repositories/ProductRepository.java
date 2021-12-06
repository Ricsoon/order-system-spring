package com.horizoncorp.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizoncorp.ordersystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
