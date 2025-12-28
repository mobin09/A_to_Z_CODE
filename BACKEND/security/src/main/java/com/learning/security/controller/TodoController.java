package com.learning.security.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TodoController {

   private  Logger logger = LoggerFactory.getLogger(getClass());

   private  final static List<Todo> list =   List.of(
            new Todo("mobin123", "Learn AWS cloud"),
            new Todo("mobin123", "Learn Java and Spring , Spring Boot"),
            new Todo("mobin123", "Learn the React"),
            new Todo("khan123", "I will learn the history")
    );

    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> retirveTod(){
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/users/{username}/todos")
    public ResponseEntity<List<Todo>> retiriveSpecificTodoTOUser(@PathVariable String username){
          List<Todo> filterTodo = list.stream()
                .filter(todo -> todo.username().equalsIgnoreCase(username))
                .collect(Collectors.toList());

         return ResponseEntity.status(HttpStatus.OK).body(filterTodo);
    }

    @PostMapping("/users/{username}/todos")
    public ResponseEntity<Void> createTodosToUser(@PathVariable String username, @RequestBody Todo todo){
        logger.info("username is::" + username +"\n Description is::" + todo.description());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

record Todo (String username, String description){}
