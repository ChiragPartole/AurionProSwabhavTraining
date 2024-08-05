package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException{

	public String getMessage() {
		return "password not valid";
	}
}
