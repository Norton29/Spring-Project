package com.br.nff.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.nff.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResources {

	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Maria", "Maria@gmail.com", "8855888", "545454sda");
		return ResponseEntity.ok().body(u);
	}
	
}
