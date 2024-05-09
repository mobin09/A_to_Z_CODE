package Todos.todos.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SpringSecurityConfiguration {
    // LDAP or Database
   //  In memory	
  //InMemoryUserDetailsManager
	@Bean
	public InMemoryUserDetailsManager createConfigUser() {
		
	 Function<String, String> passEcncoder = input -> passwordEncoderFun().encode(input);	
	 UserDetails userDetails = 	User.builder()
			 .passwordEncoder(passEcncoder)
			 .username("User")
			 .password("Admin")
			 .roles("USER", "ADMIN")
			 .build();	 
	   return new InMemoryUserDetailsManager(userDetails);	  
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoderFun() {
		return new BCryptPasswordEncoder();
	}
	
}
