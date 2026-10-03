package com.docker.learning.docker.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/v1/hello")
    public ResponseEntity<String> sayHello(){
        String message =  """
                   {
                      "message" : "Hello EveryOne"
                   }
                """;

        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}
