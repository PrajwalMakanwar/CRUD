package com.crud.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.crud.crud.entities.User;
import com.crud.crud.services.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@GetMapping("/getallusers")
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/getoneuser/{id}")
	public User gerUser(@PathVariable String id) {
		return service.getUser(Long.parseLong(id));
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id){
		try {
				service.deleteUser(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
