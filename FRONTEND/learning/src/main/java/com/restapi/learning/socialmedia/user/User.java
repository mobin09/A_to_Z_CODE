package com.restapi.learning.socialmedia.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @JsonProperty("user_name")
    private String name;
    @Past(message = "date of birth in past")
    @JsonProperty("user_dob")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    //getter setters and constructors
    public User(Integer id, String name, LocalDate birthDate){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public User(){}
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
   public Integer getId(){
        return id;
   }
   public String getName(){
        return name;
   }
   public LocalDate getBirthDate(){
        return birthDate;
   }
   public void setPosts(List<Post> posts){
        this.posts  = posts;
   }
   public List<Post> getPosts(){
        return posts;
   }

}
