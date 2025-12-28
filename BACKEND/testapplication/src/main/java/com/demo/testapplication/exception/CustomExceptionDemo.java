package com.demo.testapplication.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class CustomExceptionDemo extends RuntimeException{
    HttpStatus status;
   public CustomExceptionDemo(HttpStatus status,String message){
          super(message);
          this.status = status;
   }
}
