package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFactorial fact = (int number) ->{
			if(number < 0) {
				System.out.print("Factorial of "+number+ " is:");
				return 0;
			}
			
			if(number ==0) {
				System.out.print("Factorial of "+number+ " is:");
				return 1;
			}
			int ans=1;
			for(int i=1; i<=number; i++) {
				ans = ans*i;
			}
			return ans;
		};
		
		System.out.println(fact.factorial(-2));

	}

}
