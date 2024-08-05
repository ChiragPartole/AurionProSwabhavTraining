package com.aurionpro.selection.test;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);
		
		switch(ch) 
		{
		case 'a' : System.out.println("Vowel");
		break;
		case 'e' : System.out.println("Vowel");
		break;
		case 'i' : System.out.println("Vowel");
		break;
		case 'o' : System.out.println("Vowel");
		break;
		case 'u' : System.out.println("Vowel");
		break;
		
		default: System.out.println("Not a vowel");
		}

	}

}
