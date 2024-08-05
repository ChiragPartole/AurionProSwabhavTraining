package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;
public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		System.out.println("Enter number of users: ");
		int numberOfUsers = scanner.nextInt();
		Account users[] = new Account[numberOfUsers];
		String accountType = null;
		for(int i=0; i<numberOfUsers; i++) {
			System.out.println("Enter your name: ");
			String name = (scanner.next());
			System.out.println("Enter your balance");		
			int balance = (scanner.nextInt());
			if(balance <= 0)
				balance =(500);
			long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
			System.out.println("What is your account type(1 for current and 2 for savings): ");
			int input = scanner.nextInt();
			 switch(input) {
		      case 1:
		    	  accountType = "current";
		    	  users[i] = new CurrentAccount(accountNumber,name,balance,100,accountType);
		        break;
		      case 2:
		    	  accountType = "savings";
		    	  users[i] = new SavingsAccount(accountNumber,name,balance,500,accountType);
		    	  break;
		      default:
		    	  System.out.println("Enter valid choice");
		    }
			System.out.println("Account created!");
			
			System.out.println("Your account number is: "+ users[i].getAccountNumber());
			System.out.println("---------------------------");
		}
		
//		System.out.println(users);
		
		
		int currentUser = accountSwitch(users);
		
		do {
			System.out.println("--------------------------");
			System.out.println("Welcome "+ users[currentUser].getName());
			System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit Money "
					+ "\n3. Withdraw Money \n4. Switch users \n5. Exit");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Your current balance is: "+ users[currentUser].getBalance());break;
			case 2: 
				System.out.println("Enter amount to deposit: ");
				users[currentUser].credit(scanner.nextInt());
			
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				
				
				if(users[currentUser].getAccountType().equals("current")) {
					
					((CurrentAccount)users[currentUser]).debit(scanner.nextInt());
				}
				if(users[currentUser].getAccountType().equals("savings")) {
					
					((SavingsAccount)users[currentUser]).debit(scanner.nextInt());
				}
				break;
			case 4:		
				currentUser = accountSwitch(users);
				break;
			
			case 5: exit =true; break;
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
	
	private static int accountSwitch(Account users[]) {
		
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
	

}
