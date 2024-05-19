package com.demo.rest.webservices.restfullwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    
    static Integer count = 0;
    static {
    	users.add(new User(++count, "Mobin Arshad",LocalDate.now().minusYears(26)));
    	users.add(new User(++count, "Washim Arshad", LocalDate.now().minusYears(22)));
    	users.add(new User(++count, "Nadim Arshad", LocalDate.now().minusYears(18)));
    	users.add(new User(++count, "Jashim Arshad", LocalDate.now().minusYears(14)));    	
    }
    
    public List<User> getAllUsers(){
    	return users;
    }
    
    public User findById(Integer id) {
    	return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }
    
    public User save(User user) {
    	user.setId(++count);
    	users.add(user);
    	return user;
    }
    
    
    
    
}
