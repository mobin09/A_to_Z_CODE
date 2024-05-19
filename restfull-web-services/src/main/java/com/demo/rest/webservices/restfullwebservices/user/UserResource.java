package com.demo.rest.webservices.restfullwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
   
	@Autowired
	private UserDaoService userService;
	
	// GET /users
	@GetMapping(path = "/users")
	public List<User> getAllusers() {
		return userService.getAllUsers();
	}
	
	// GET /users/{id}
	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable Integer id) throws UserNotAvailableException {
		User user = userService.findById(id);
		if(user == null) {
			throw new UserNotAvailableException("id:" + id);
		}
		return user;
	}
	
	// POST /users
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
	  User saved = userService.save(user);
	  URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
			          .path("/{id}")
			          .buildAndExpand(saved.getId())
			          .toUri();
	return ResponseEntity.created(location).build();
	
	}
	
	
}
