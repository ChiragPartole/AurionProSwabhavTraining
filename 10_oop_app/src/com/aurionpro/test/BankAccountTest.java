package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.BankAccount;
import com.aurionpro.model.BankAccountType;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean exit = false;
		
		System.out.println("Enter number of users: ");
		int numberOfUsers = scanner.nextInt();
		BankAccount users[] = new BankAccount[numberOfUsers];
		
		for(int i=0; i<numberOfUsers; i++) {
			System.out.println("Enter your name: ");
			String name = (scanner.next());
			
			System.out.println("Enter your balance");		
			int balance = (scanner.nextInt());
			
			if(balance <= 0) {
				balance =(500);
			}
			
			long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
			
			System.out.println("What is your account type(1 for current and 2 for savings): ");
			int input = scanner.nextInt();
			BankAccountType accountType = null ;
			 switch(input) {
		      case 1:
		        accountType = accountType.current;
		        break;
		      case 2:
		         accountType = accountType.savings;
		        break;
		      default:
		    	  System.out.println("Enter valid choice");
		    }
			System.out.println("Account created!");
			
			users[i] =  new BankAccount(accountNumber, name, balance,accountType); // parameterized constructer
			System.out.println("Your account number is: "+ users[i].getAccountNumber());
			System.out.println("---------------------------");
			
		}
		
		for(int i=0; i<numberOfUsers; i++) {
			System.out.println("User"+i+": ");
			users[i].display();
			System.out.println("--------------------------");
		}
		
		
		int currentUser = accountSwitch(users);
		
		do {
			System.out.println("--------------------------");
			System.out.println("Welcome "+ users[currentUser].getName());
			System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit Money "
					+ "\n3. Withdraw Money \n4. Switch users \n5. Get details of account with maximum balance"
					+ "\n6. Exit");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Your current balance is: "+ users[currentUser].getBalance());break;
			case 2: 
				System.out.println("Enter amount to deposit: "); 
				users[currentUser].credit(scanner.nextInt());
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				users[currentUser].debit(scanner.nextInt());
				break;
			case 4:		
				currentUser = accountSwitch(users);
				break;
			case 5:  getMaximumBalanceAccount(users); break;
			case 6: exit =true; break;
			default:
				System.out.println("Invalid input. Please select correct option");
			}
			System.out.println("---------------------------------------");
		}
		while(exit == false);
		
		
		if(exit == true) {
			System.out.println("Thank you for using the ATM. Goodbye!");
		}
		
	}
	
	private static int accountSwitch(BankAccount users[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your account number: ");
		long checker = scanner.nextLong();
		int currentUser = 0;
		for(int i=0; i<users.length; i++) {
			if(checker == users[i].getAccountNumber()) {
				currentUser =i;
				break;
			}
		}
		return currentUser;
	}
	
	private static void getMaximumBalanceAccount(BankAccount users[]) {
		int maximumBalance =0;
		int index =0;
		for(int i=0; i<users.length; i++) {
			if(maximumBalance < users[i].getBalance()) {
				maximumBalance = users[i].getBalance();
				index =i;
			}
		}
		users[index].display();
		
	}

}
