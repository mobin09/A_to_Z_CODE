package com.demo.rest.webservices.restfullwebservices.customException;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Total Error counts::" + ex.getFieldErrorCount() + ", ");
		List<ObjectError> err = ex.getAllErrors();
		for(ObjectError objError: err) {
			String errDets = objError.getObjectName()+  "::" + objError.getDefaultMessage();
			sb.append(errDets +", ");
		}
		CustomError error = new CustomError(LocalDateTime.now(), sb.toString(), request.getDescription(false));
		
		return new ResponseEntity<>(error,  HttpStatus.BAD_REQUEST);
	}
	
}
