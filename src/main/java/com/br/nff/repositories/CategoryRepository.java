package com.br.nff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.nff.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
