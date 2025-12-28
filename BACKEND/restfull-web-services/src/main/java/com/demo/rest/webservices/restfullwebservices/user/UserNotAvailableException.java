package com.demo.rest.webservices.restfullwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotAvailableException extends Exception {
      public UserNotAvailableException(String message) {
    	  super(message);
      }
}
