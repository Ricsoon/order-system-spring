package com.horizoncorp.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizoncorp.ordersystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
