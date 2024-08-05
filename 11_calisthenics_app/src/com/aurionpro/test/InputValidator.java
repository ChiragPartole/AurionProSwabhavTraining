package com.aurionpro.test;

import java.util.Scanner;

public class InputValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		boolean checker = false;
		while(checker == false) {
			
			System.out.println("ENter user name: ");
			String userName = scanner.next();
			checker = checkString(userName,3,8);
		}
		
		checker = false;
		while(checker == false) {
			System.out.println("Enter password: ");
			String password = scanner.next();
			checker = checkString(password,3,10);
			
		}
		

	}

	private static boolean checkString(String name,int lowerLimit,int upperLimit) {
		// TODO Auto-generated method stub\
		if(name.isEmpty() || name==null) {
			System.out.println("Cannot have empty passsword");
			return false;
		}

		if(name.length() <lowerLimit || name.length()>upperLimit) {
			System.out.println("Length must be between "+lowerLimit+" and "+upperLimit);
			return false;
		}
		return true;
	}

	

	private static String checkUsername(String userName) {
		// TODO Auto-generated method stub
		if(userName.isEmpty()) {
			System.out.println("Cannot accept empty username");
			return null;
		}
		if(userName.length() <3 || userName.length() >20) {
			System.out.println("Length must be between 3 and 20"); 
			return null;
		}
		return  userName;
	}

}
