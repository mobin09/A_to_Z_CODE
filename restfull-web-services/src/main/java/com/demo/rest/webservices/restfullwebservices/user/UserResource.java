package com.demo.rest.webservices.restfullwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
   
	@Autowired
	private UserDaoService userService;
	
	@GetMapping(path = "/users")
	public List<User> getAllusers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	
}
