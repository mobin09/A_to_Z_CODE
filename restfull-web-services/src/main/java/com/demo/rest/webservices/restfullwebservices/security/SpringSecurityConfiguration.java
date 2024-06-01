package com.demo.rest.webservices.restfullwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	
    	//1.) all request should be authenticated
    	http.authorizeHttpRequests(
    			  auth -> auth.anyRequest().authenticated()
    			);
    	//2.) If request is not authenticated, a web page shown
    	http.httpBasic(withDefaults());
    	// 3.) disabled CSRF
    	http.csrf().disable();
    	
    	return http.build();
    }
}
