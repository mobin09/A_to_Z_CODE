package com.docker.learning.learndocker.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

     @GetMapping("/say-hello")
      public ResponseEntity<String> sayHello(){

         String message = """
                  {
                     "message": "Hello Wolrd Java"
                  }
                 """;

          return ResponseEntity.status(HttpStatus.OK).body(message);
      }

}
