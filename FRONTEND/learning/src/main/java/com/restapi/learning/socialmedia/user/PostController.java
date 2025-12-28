package com.restapi.learning.socialmedia.user;

import com.restapi.learning.socialmedia.user.service.PostService;
import com.restapi.learning.socialmedia.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @GetMapping("/users/{id}/posts")
    public List<Post> getAllPost(@PathVariable  Integer id) throws UserNotFoundException {
        Optional<User> user =  userService.findById(id);
        if(user.isEmpty())
            throw new UserNotFoundException("User is not present with id:::" + id);
       return user.get().getPosts();
    }
    @PostMapping("/users/{id}/posts")
    public void savePost(@PathVariable Integer id, @Valid @RequestBody Post post)
            throws UserNotFoundException {
        postService.save(id, post);
    }
}
