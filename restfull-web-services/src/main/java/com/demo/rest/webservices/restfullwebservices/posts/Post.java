package com.demo.rest.webservices.restfullwebservices.posts;

import com.demo.rest.webservices.restfullwebservices.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {
	
   @Id
   @GeneratedValue
   private Integer id;
   
   private String description;
   @ManyToOne(fetch = FetchType.LAZY)
   @JsonIgnore
   private User user;
   
   public Post(Integer id, String description) {
	super();
	this.id = id;
	this.description = description;
  }

public Integer getId() {
	return id;
}

public String getDescription() {
	return description;
}

   
}
