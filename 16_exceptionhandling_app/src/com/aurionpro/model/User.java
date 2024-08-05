package com.aurionpro.model;
import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
public class User {
	private String email;
	private String password;
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		emailChecker();
		passwordChecker();
	}
	
	private void passwordChecker() {
		if(password ==null || password.isEmpty() || password.length() <8)
			throw new PasswordNotValidException();
        int uppercase = 0;
        int digit = 0;
        int specialCharacter = 0;

        for (char i : password.toCharArray()) {
            if (Character.isUpperCase(i)) {
            	uppercase = 1;
            }
            if (Character.isDigit(i)) {
            	digit = 1;
            }
            if (!Character.isLetterOrDigit(i)) {
            	specialCharacter = 1;
            }
        }
        if(uppercase ==0 || specialCharacter ==0 || digit==0)
        	throw new PasswordNotValidException();
	}


	private void emailChecker() {
		if (email == null || email.isEmpty()) {
            throw new EmailNotValidException();
        }
        if ( email.indexOf('@') < 1 ||  email.indexOf('@') != email.lastIndexOf('@')) {
        	throw new EmailNotValidException();
        }

        String firstPart = email.substring(0,  email.indexOf('@'));
        String secondPart = email.substring( email.indexOf('@') + 1);

        if (firstPart.isEmpty() || secondPart.isEmpty() || firstPart.contains(".") || secondPart.indexOf('.') != secondPart.lastIndexOf('.')) {
        	throw new EmailNotValidException();
        }

        int dotIndex = secondPart.indexOf('.');
        if (dotIndex < 1 || dotIndex == secondPart.length() - 1) {
        	throw new EmailNotValidException();
        }

        String invalidCharacters = "(),:;<>[\\]\"!#$%^&*_-+= {} ";
        for (char c : invalidCharacters.toCharArray()) {
            if (firstPart.indexOf(c) >= 0 || secondPart.indexOf(c) >=0) {
            	throw new EmailNotValidException();
            }
        }
		
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	

}
