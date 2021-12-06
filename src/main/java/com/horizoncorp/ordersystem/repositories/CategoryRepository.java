package com.horizoncorp.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizoncorp.ordersystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
