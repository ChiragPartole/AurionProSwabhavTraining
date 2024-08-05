package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter votr id: ");
		int voterId = scanner.nextInt();
		System.out.println("Enter First name");
		String firstName = scanner.next();
		System.out.println("Enter last name");
		String lastName = scanner.next();
		System.out.println("Enter age");
		int age = scanner.nextInt();
		
		Voter voter = new Voter(voterId,firstName,lastName,age);
		System.out.println(voter);
		
		
		}
		catch (AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
