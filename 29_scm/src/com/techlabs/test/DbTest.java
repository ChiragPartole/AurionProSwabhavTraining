package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.DBConnection;

public class DbTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DBConnection connection = new DBConnection();
		
		connection.connectToDB();
		System.out.println("------------WELCOME TO SCM------------");
		
		boolean exit = false;
		
		while(exit ==false) {
			System.out.println("What do you want to do? Enter number accordingly");
			System.out.println("0. EXIT");
			System.out.println("1.display supplier \t 2.display products \t 3.display orders "
					+ "\t 4.display orderdetails \t 5.display inventory");
			System.out.println("6.add supplier \t 7.add product \t 8.add inventory");
			int choice = scanner.nextInt();
			
			
			switch(choice) {
			
			case 0:{
				exit = true;
				System.out.println("EXITING!!!");
				break;
			}
			
			case 1: connection.displaySuppliers();break;
			case 2: connection.displayProducts();break;
			case 3: connection.displayOrders();break;
			case 4: connection.displayOrderDetails();break;
			case 5: connection.displayInventory();break;
			case 6: connection.addSuppliers();break;
			case 7: connection.addProducts();break;
			case 8: connection.addInventory();break;
			}
		}

	}

}
