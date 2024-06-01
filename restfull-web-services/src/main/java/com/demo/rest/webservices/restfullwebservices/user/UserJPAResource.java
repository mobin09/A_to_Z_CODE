package com.demo.rest.webservices.restfullwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import com.demo.rest.webservices.restfullwebservices.jpa.PostRepository;
import com.demo.rest.webservices.restfullwebservices.jpa.UserRepository;
import com.demo.rest.webservices.restfullwebservices.posts.Post;

import jakarta.validation.Valid;

@RestController
public class UserJPAResource {
   
	@Autowired
	private UserDaoService userService;
	@Autowired
	private UserRepository repository;
	@Autowired
	private PostRepository postRepository;
	
	// GET /users
	@GetMapping(path = "/users")
	public List<User> getAllusers() {
		return repository.findAll();
	}
	
	
	// GET /users/{id}
	@GetMapping(path = "/users/{id}")
	public EntityModel<User> getUser(@PathVariable Integer id) throws UserNotAvailableException {
		Optional<User> user = repository.findById(id);
		if(user.isEmpty()) {
			throw new UserNotAvailableException("id:" + id);
		}
		EntityModel<User> entityModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllusers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}

	
	// POST /users
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
	  User saved = repository.save(user);
	  URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
			          .path("/{id}")
			          .buildAndExpand(saved.getId())
			          .toUri();
	return ResponseEntity.created(location).build();
	
	}
	
	//DELETE /users/{id}
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	
	@GetMapping("/users/{id}/posts")
	public List<Post> getPostofUser(@PathVariable Integer id) throws UserNotAvailableException{
		Optional<User> user = repository.findById(id);
		
		if(user.isEmpty()) {
			throw new UserNotAvailableException("id:" + id);
		}
		return user.get().getPosts();	
	}
	
	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Post> postsData(@PathVariable Integer id ,@Valid @RequestBody Post post) throws UserNotAvailableException {
Optional<User> user = repository.findById(id);
		
		if(user.isEmpty()) {
			throw new UserNotAvailableException("id:" + id);
		}
		
		post.setUser(user.get());
		
		Post p = postRepository.save(post);
		
		URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
		          .path("/{id}")
		          .buildAndExpand(p.getId())
		          .toUri(); 
		
		return ResponseEntity.created(location).build();
		
	  }
}
