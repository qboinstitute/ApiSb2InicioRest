package com.qbo.exception;

import java.util.Date;

public class MensajeError {
	
	private int statusCode;
	private Date timeStamp;
	private String message;
	private String description;
	public int getStatusCode() {
		return statusCode;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return description;
	}
	public MensajeError(int statusCode, Date timeStamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		this.timeStamp = timeStamp;
		this.message = message;
		this.description = description;
	}
	
	

}
