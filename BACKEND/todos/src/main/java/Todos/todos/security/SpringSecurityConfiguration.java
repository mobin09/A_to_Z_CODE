package Todos.todos.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


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
			 .username("mobink09")
			 .password("Admin")
			 .roles("USER", "ADMIN")
			 .build();	
	 
	   UserDetails userDetails2 = User.builder()
			   .passwordEncoder(passEcncoder)
			   .username("Dummy")
			   .password("Dummy")
			   .roles("USER", "ADMIN")
			   .build();
	 
	   return new InMemoryUserDetailsManager(userDetails, userDetails2);	  
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoderFun() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		   http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		   http.formLogin(withDefaults()); // withDefaults() method present in the  import static org.springframework.security.config.Customizer.withDefaults;
		   http.csrf().disable();
		   http.headers().frameOptions().disable();
		  
		return http.build();
	}
	
	
	
}
