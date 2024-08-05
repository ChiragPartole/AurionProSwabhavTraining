package com.aurionpro.July11.model;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {

	public static String getRandom(String[] array) {
		
		Random random = new Random();
		int index = random.nextInt(array.length);
		return array[index];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final String[] words = {"Adequate", "Anywhere", "Approach", "Activity", "Anything",
				"Approval", "Advanced", "Although", "Academic", "Advocate", "Accident",  
				"Addition", "Absolute", "Attitude", "Birthday", "Behavior", "Bathroom", 
				"Boundary", "Building", "Business", "Capacity", "Champion", "Campaign", 
				"Convince", "Conflict", "Changing", "Ceremony", "Clothing", "Category",   
				"Employer", "Employee", "Emphasis", "Economic", "Everyone", "Evidence", 
				"Electric", "Entirely", "Educator"};
		
		String randomWord = getRandom(words);
		randomWord = randomWord.toLowerCase();
		char[] word = new char[randomWord.length()];
		char[] ans = new char[randomWord.length()];
		System.out.println(randomWord);
		System.out.println("Length of the word is: "+randomWord.length());
		int noOfTries = randomWord.length();
		int remaining = randomWord.length();
		
		for(int i=0; i<=word.length-1; i++) {
			word[i] = randomWord.charAt(i);
			ans[i] = '_' ; 
		}
		
		System.out.println("Welcome to word guesser");
		while (noOfTries>0){
			
			for(int i=0; i<=word.length-1; i++) {
				System.out.print(ans[i]);
			}
			
			System.out.println(" \n Guess a letter");
			char guess = scanner.next().charAt(0);
			int flag =0;
			for(int i=0; i<=word.length-1; i++) {
				if(guess == word[i]) {
					System.out.println("Correct guess");
					ans[i] = guess;
					flag =1;
					remaining--;
				}
			}
			
			if(flag == 0) {
				System.out.println("Incorrect guess, try again");
				noOfTries--;
				System.out.println("Lives remaining: "+noOfTries);
			}
			if(remaining ==0) {
				System.out.println("You have guessed the word correctly");
				for(int i=0; i<=word.length-1; i++) {
					System.out.print(ans[i]);
				}
				break;
			}

		}
		
		if(noOfTries <= 0) {
			System.out.println("Out of Lives, Game Over");
		}
		
		
		
		
	}
	
	
}