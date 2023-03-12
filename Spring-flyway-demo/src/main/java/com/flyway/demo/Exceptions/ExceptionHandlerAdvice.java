package com.flyway.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flyway.demo.response.ApplicationResponse;

@ControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception e) {
		return ApplicationResponse.generateResponse(""+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, e.getCause());
					
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleException(UserNotFoundException e) {
		return ApplicationResponse.generateResponse(""+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, e);
					
	}
}