package com.techlabs.test;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter number");
		int num = scanner.nextInt();
		Consumer<Integer> consumerSquare = (Integer number)-> System.out.println("Square of "+number+ " is: "+ number*number);

		
		Consumer<Integer> consumerFactorial = (Integer number)->
		{
			if(number < 0) {
				System.out.print("Factorial of "+number+ " is: undefined");
			}
			
			if(number ==0) {
				System.out.print("Factorial of "+number+ " is: 1");
			}
			int ans=1;
			for(int i=1; i<=number; i++) {
				ans = ans*i;
			}
			System.out.print("Factorial of "+number+ " is: "+ ans); 
		};
 		
		consumerSquare.accept(num);
		consumerFactorial.accept(num);
	}

}
