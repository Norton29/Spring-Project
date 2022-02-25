package com.br.nff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.nff.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
