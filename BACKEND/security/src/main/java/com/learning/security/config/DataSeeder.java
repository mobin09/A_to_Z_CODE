package com.learning.security.config;


import com.learning.security.entity.UserEntity;
import com.learning.security.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataSeeder {
    @Bean
    CommandLineRunner init(UserRepository repository, PasswordEncoder encoder){
        return args -> {
            if(repository.count() == 0){
                repository.save(new UserEntity("mobink09", encoder.encode("12345"), "USER"));
                repository.save(new UserEntity("admin", encoder.encode("12345"), "ADMIN"));
            }
        };
    }
}
