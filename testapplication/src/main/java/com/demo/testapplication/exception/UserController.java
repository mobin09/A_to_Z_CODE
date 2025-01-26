package com.demo.testapplication.exception;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @GetMapping(value = "/get-user")
    public ResponseEntity<?> getUser() {
           // your business logic and validations ....
           throw new CustomExceptionDemo(HttpStatus.INTERNAL_SERVER_ERROR, "userid is missing");
    }

    @ExceptionHandler(CustomExceptionDemo.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "invalid request sent")
    public void handleCustomExceptionDemo(CustomExceptionDemo ex, HttpServletResponse response) throws  IOException{
         response.sendError(HttpStatus.FORBIDDEN.value(), "You are not authorized" );
    }
}



//1.0
//@GetMapping(value = "get-user")
//public String getUser() {
//    throw new NullPointerException("throwing null pointer exception for testing");
//}

//2.0
//@GetMapping(value = "/get-user")
//public String getUser(){
//    throw new CustomException(HttpStatus.BAD_REQUEST, "request is not correct, userId is missing");
//}
//@ExceptionHandler(IllegalArgumentException.class)
//public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e){
//    return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
//}

//@ExceptionHandler({CustomException.class, IllegalArgumentException.class})
//public ResponseEntity<String> handleException(Exception e){
//    return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//}
//
//@GetMapping(value = "/get-user-history")
//public ResponseEntity<?> getUserHistory(){
//    // your business logic and validations ....
//    throw new IllegalArgumentException("inappropriate argument passed");
//}


//@ExceptionHandler(CustomException.class)
//public void handleCustomException(CustomException ex, HttpServletResponse response) throws IOException {
//    response.sendError(ex.getHttpStatus().value(), ex.getMessage());
//}
