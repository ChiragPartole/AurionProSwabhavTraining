package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			
		System.out.println("Enter email: ");
		String email = scanner.next();
		
		System.out.println("Enter password: ");
		String password = scanner.next();
		
		User user = new User(email,password);
		System.out.println(user);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}

		
		
	}
	
	 

}
