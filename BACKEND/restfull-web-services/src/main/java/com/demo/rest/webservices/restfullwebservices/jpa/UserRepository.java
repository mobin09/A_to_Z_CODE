package com.demo.rest.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.webservices.restfullwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
   
}
