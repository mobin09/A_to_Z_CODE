package com.learning.security.service;

import com.learning.security.entity.UserEntity;
import com.learning.security.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

   private static Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    // this class will call by spring security
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user =  userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found::" + username));
        UserDetails u2 = User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole()).build();
        logger.info("User details is ::" + u2);
        return u2;
    }
}
