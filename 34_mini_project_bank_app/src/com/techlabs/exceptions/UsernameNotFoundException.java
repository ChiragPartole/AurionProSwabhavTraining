package com.techlabs.exceptions;

public class UsernameNotFoundException extends RuntimeException{

	public String getMessage() {
		return "Cannot perform the given task. \n Username not found in database.";
	}
}
