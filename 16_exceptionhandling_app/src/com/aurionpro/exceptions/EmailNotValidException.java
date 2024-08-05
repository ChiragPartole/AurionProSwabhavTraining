package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException{

	public String getMessage() {
		return "Email not valid";
	}
}
