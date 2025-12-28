package com.restapi.learning.socialmedia.user.service;


import com.restapi.learning.socialmedia.user.Post;
import com.restapi.learning.socialmedia.user.User;
import com.restapi.learning.socialmedia.user.UserNotFoundException;
import com.restapi.learning.socialmedia.user.repository.PostRepository;
import com.restapi.learning.socialmedia.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
   @Autowired
   private PostRepository postRepository;
   @Autowired
   private UserRepository userRepository;

   public void save(Integer id, Post post) throws UserNotFoundException{
       Optional<User> user =  userRepository.findById(id);
       if(user.isEmpty())
           throw  new UserNotFoundException("User is not found::" + id);
       post.setUser(user.get());
       postRepository.save(post);
   }

}
