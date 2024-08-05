package com.aurionpro.July11.model;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Number Guesser");
		
		Random random = new Random();
		
		int target = random.nextInt(100);
		int no_of_tries = 10;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your guess");
		int guess = scanner.nextInt();
		
		while(no_of_tries >=0) {
		
		if(no_of_tries ==0) {
			System.out.println("Game over, The number was: "+target);
			break;
		}
		if(guess > target) {
			no_of_tries --;
			System.out.println("Your guess is higher, guess lower, Number of tries left: "+no_of_tries);
			System.out.println("Enter your guess");
			guess = scanner.nextInt();
		}else if(guess <target) {
			no_of_tries --;
			System.out.println("Your guess is lower, guess higher, Number of tries left: "+no_of_tries);
			System.out.println("Enter your guess");
			guess = scanner.nextInt();
		}else {
			System.out.println("Correct guess!! \n The number was: "+target);
			break;
		}

	}

}
}