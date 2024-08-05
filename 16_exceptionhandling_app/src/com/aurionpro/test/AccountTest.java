package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.model.Account;
public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENter account number: ");
		int accountNumber =scanner.nextInt();
		System.out.println("ENter name: ");
		String name = scanner.next();
		System.out.println("ENter balance: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(accountNumber,name,balance);
		
		boolean exit = false;
		while(exit == false) {
			try {
				System.out.println("Enter amount to credit");
				account.credit(scanner.nextInt());
				System.out.println("Enter amount to debit");
				account.debit(scanner.nextInt());
			}
			catch (InsufficientBalanceException exception)
			{
				System.out.println(exception.getMessage());
			}
			System.out.println("Exit? (press 1 for yes, 0 for no)");
			int checker = scanner.nextInt();
			
			switch(checker) {
			case 0: exit = false; break;
			case 1: exit =true; break;
			default: System.out.println("Enter valid input");
			}
		}

	}

}
