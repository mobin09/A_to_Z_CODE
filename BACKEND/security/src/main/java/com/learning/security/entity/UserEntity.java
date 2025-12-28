package com.learning.security.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    private String role;
    public UserEntity(){}
    public UserEntity(String username, String password,String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }
    // getters and setters
    public Long getId(){
        return id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setRoles(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
}
