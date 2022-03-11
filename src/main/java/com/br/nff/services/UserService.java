package com.br.nff.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.nff.entities.Users;
import com.br.nff.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		Optional<Users> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public Users insert(Users obj) {
		return repository.save(obj);
		
	}
}
