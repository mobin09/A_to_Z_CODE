package com.demo.rest.webservices.restfullwebservices.customException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.rest.webservices.restfullwebservices.user.UserNotAvailableException;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<CustomError> handleAllException(Exception ex, WebRequest request) throws Exception {
		CustomError error = new CustomError(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<CustomError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(UserNotAvailableException.class)
	public final ResponseEntity<CustomError> handleExceptionUserNotAvailableException(Exception ex, WebRequest request) throws Exception {
		CustomError error = new CustomError(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<CustomError>(error, HttpStatus.NOT_FOUND);
	}
	
}
