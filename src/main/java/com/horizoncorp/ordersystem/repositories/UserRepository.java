package com.horizoncorp.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizoncorp.ordersystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
