package com.restapi.learning.socialmedia.user.repository;

import com.restapi.learning.socialmedia.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
       // findById
       // findByName
       // findByAge
       // findAll
      // these types of method is already defined
      // save
}
