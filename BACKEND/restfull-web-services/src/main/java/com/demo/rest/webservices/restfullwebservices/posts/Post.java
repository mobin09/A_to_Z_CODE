package com.demo.rest.webservices.restfullwebservices.posts;

import com.demo.rest.webservices.restfullwebservices.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	
   @Id
   @GeneratedValue
   private Integer id;
   @Size(min = 2)
   private String description;
   @ManyToOne(fetch = FetchType.LAZY)
   @JsonIgnore
   private User user;
   
   public Post() {
	   
   }
   
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

public void setId(Integer id) {
	this.id = id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

   
}
