package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.SCMConnection;

public class SCMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SCMConnection connection = new SCMConnection();
		
		connection.connectToDB();
		System.out.println("------------WELCOME TO SCM------------");
		
		boolean exit = false;
		
		while(exit == false) {
			System.out.println("What do you want to do? Enter number accordingly");
			System.out.println("1. List all products along with their supplier names");
			System.out.println("2. Get all orders with their details (including product names and quantities)");
			System.out.println("3. Find all suppliers who have supplied a specific product (e.g., ProductID = 1)");
			System.out.println("4. List all products and their current inventory levels");
			System.out.println("5. Find all orders placed within the last month");
			System.out.println("6. Get total quantity ordered for each product");
			System.out.println("7. Retrieve all orders along with the total amount spent for each order");
			System.out.println("8. Find products supplied by more than one supplier");
			System.out.println("9. Get the average inventory level for each product");
			System.out.println("10. List suppliers who have not supplied any products");
			System.out.println("11. EXIT");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			
			case 1: {
				System.out.println("----------------------------------------------------");
				connection.case1();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 2: {
				System.out.println("----------------------------------------------------");
				connection.case2();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 3: {
				System.out.println("----------------------------------------------------");
				connection.case3();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 4: {
				System.out.println("----------------------------------------------------");
				connection.case4();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 5: {
				System.out.println("----------------------------------------------------");
				connection.case5();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 6: {
				System.out.println("----------------------------------------------------");
				connection.case6();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 7: {
				System.out.println("----------------------------------------------------");
				connection.case7();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 8: {
				System.out.println("----------------------------------------------------");
				connection.case8();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 9: {
				System.out.println("----------------------------------------------------");
				connection.case9();
				System.out.println("----------------------------------------------------");
				break;
			}
			case 10: {
				System.out.println("----------------------------------------------------");
				connection.case10();
				System.out.println("----------------------------------------------------");
				break;
			}
			
			case 11:{
				exit=true; 
				System.out.println("Exiting!!");
				break;
			}
			}
			
			
			
		}
		
		
	}

}
