package com.qbo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public MensajeError resourceNotFoundException(
			ResourceNotFoundException ex, WebRequest request
			) {
		MensajeError mensaje = new MensajeError(
				HttpStatus.NOT_FOUND.value()
				, new Date()
				, ex.getMessage()
				, request.getDescription(false));
		return mensaje;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public MensajeError globalExceptionHandler(
			Exception ex, WebRequest request
			) {
		MensajeError mensaje = new MensajeError(
				HttpStatus.INTERNAL_SERVER_ERROR.value()
				, new Date()
				, ex.getMessage()
				, request.getDescription(false));
		return mensaje;
	}
	
	
}
