package com.br.nff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.nff.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	
}
