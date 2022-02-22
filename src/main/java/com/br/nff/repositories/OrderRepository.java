package com.br.nff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.nff.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
