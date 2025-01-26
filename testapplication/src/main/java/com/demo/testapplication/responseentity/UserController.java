package com.demo.testapplication.responseentity;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @GetMapping(value = "/get-old-user")
    public ResponseEntity<Void> getOldUser(){
        return ResponseEntity
                .status(HttpStatus.MOVED_PERMANENTLY)
                .header("location", "/api/get-new-user")
                .build();
    }

    @GetMapping(value = "/get-new-user")
    public ResponseEntity<String> getnewUser(){
        return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
    }
}


// @GetMapping(value = "/getuser")
//    public ResponseEntity<String> getUser(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("My-Header1", "SomeValue1");
//        headers.add("My-Header2", "SomeValue2");
//      return ResponseEntity.status(HttpStatus.OK).headers(headers).body("My Response body Object go here");
//    }
//
//
//    @GetMapping(value = "/getuserv1")
//    public User getUserV1(){
//        return new User("Mobin", 26);
//    }
