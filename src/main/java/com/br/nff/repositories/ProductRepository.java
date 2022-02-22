package com.br.nff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.nff.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
