package com.demo.rest.webservices.restfullwebservices.user;

import java.net.URI;
import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

//@RestController
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
	public EntityModel<User> getUser(@PathVariable Integer id) throws UserNotAvailableException {
		User user = userService.findById(id);
		if(user == null) {
			throw new UserNotAvailableException("id:" + id);
		}
		EntityModel<User> entityModel = EntityModel.of(user);
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllusers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}

	
	// POST /users
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
	  User saved = userService.save(user);
	  URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
			          .path("/{id}")
			          .buildAndExpand(saved.getId())
			          .toUri();
	return ResponseEntity.created(location).build();
	
	}
	
	//DELETE /users/{id}
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		 userService.deleteById(id);
	}
	
	
}
