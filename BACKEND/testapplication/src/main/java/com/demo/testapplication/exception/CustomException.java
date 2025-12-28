package com.demo.testapplication.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends  RuntimeException{
   private HttpStatus httpStatus;
   private String message;
   public CustomException(HttpStatus httpStatus, String message){
       this.httpStatus = httpStatus;
       this.message = message;
   }
    public HttpStatus getHttpStatus(){
         return httpStatus;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
