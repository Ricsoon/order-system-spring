package com.horizoncorp.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizoncorp.ordersystem.entities.OrderItem;
import com.horizoncorp.ordersystem.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
