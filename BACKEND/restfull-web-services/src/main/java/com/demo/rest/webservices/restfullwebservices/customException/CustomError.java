package com.demo.rest.webservices.restfullwebservices.customException;

import java.time.LocalDateTime;

public class CustomError {
     // timestamp
	 // message
	 // details
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	
	public CustomError(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	
}
