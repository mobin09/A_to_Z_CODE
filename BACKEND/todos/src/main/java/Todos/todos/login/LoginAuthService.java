package Todos.todos.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthService {
     public boolean isValidUser(String username, String pass) {
    	 return username.equals("Dummy") && pass.equals("Dummy");
     }
}
