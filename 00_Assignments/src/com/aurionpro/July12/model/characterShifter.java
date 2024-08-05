package com.aurionpro.July12.model;

import java.util.Scanner;

public class characterShifter {

	private static void shiftCharacters(char[] array,int n) {
		int size = array.length;
		char[] ans = new char[size];
		
		for(int i=0; i<size; i++) {
			
			if(Character.isUpperCase(array[i]) == true) {
				int ascii = ((array[i] -'A') + n)%26;   //A = 65
				ans[i] =(char) (ascii +'A');	
			}else {
				int ascii = ((array[i] -'a') + n)%26;   //a = 97
				ans[i] =(char) (ascii +'a');
			}
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(ans[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String word = scanner.next();
		
		System.out.println("Enter how many shifts: ");
		int n = scanner.nextInt();
		
		char[] array = new char[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			array[i] = word.charAt(i);
		}
		
		shiftCharacters(array,n);
		
		

	}

}
