package com.example.demo.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.*;

@RestController
public class UserResource {
	UserDaoService service;
	UserResource(UserDaoService service){
		this.service = service;
	}
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.findAll();
	}
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return service.findUser(id);
	}
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userCreated = service.createUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(userCreated.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
}
