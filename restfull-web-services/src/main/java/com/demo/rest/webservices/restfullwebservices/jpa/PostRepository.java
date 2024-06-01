package com.demo.rest.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.webservices.restfullwebservices.posts.Post;
public interface PostRepository extends JpaRepository<Post, Integer>{

}
