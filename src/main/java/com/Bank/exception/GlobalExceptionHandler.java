package com.Bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	ResponseEntity<String>  ExceptionHandler(UserNotFoundException userNotFoundException)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(userNotFoundException.getMessage());
	}

}
