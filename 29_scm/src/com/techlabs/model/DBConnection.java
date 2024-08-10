package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	
	public void connectToDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			statement = connection.createStatement();
			
			System.out.println("Connection sucessfull");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displaySuppliers() {
		
		try {
			ResultSet suppliers = statement.executeQuery("SELECT * from suppliers");			
			
			System.out.println("Suppliers");
			System.out.println("supplierID \t name \t contactinfo \t address");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t" + suppliers.getString(2)+"\t"+ 
			suppliers.getString(3)+ "\t"+suppliers.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSuppliers() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter supplier id: ");
		int supplierID = scanner.nextInt();
		System.out.println("ENter name: ");
		String name = scanner.next();
		System.out.println("ENter contact info: ");
		String contactInfo = scanner.next();
		System.out.println("ENter address: ");
		String address = scanner.next();
		
		try {
			preparedStatement = connection.prepareStatement("Insert into suppliers values(?,?,?,?)");
			preparedStatement.setInt(1, supplierID);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, contactInfo);
			preparedStatement.setString(4, address);
			
			preparedStatement.executeUpdate();
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void displayProducts() {
		
		try {
			ResultSet products = statement.executeQuery("SELECT * from products");
			System.out.println("products");
			System.out.println("productID \t name \t description \t supplierID");
			while(products.next()) {
				System.out.println(products.getInt(1) + "\t" + products.getString(2)+"\t"+ 
						products.getString(3)+ "\t"+products.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addProducts() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter product id: ");
		int productID = scanner.nextInt();
		System.out.println("ENter name: ");
		String name = scanner.next();
		System.out.println("ENter description: ");
		String description = scanner.next();
		System.out.println("ENter supplier id: ");
		int supplierID = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("Insert into products values(?,?,?,?)");
			preparedStatement.setInt(1, productID);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, description);
			preparedStatement.setInt(4, supplierID);
			
			preparedStatement.executeUpdate();
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void displayInventory() {
		
		try {
			ResultSet inventory = statement.executeQuery("SELECT * from inventory");
			System.out.println("inventory");
			System.out.println("inventoryID \t productID \t quantityonhand");
			while(inventory.next()) {
				System.out.println(inventory.getInt(1) + "\t\t" + inventory.getInt(2)+"\t\t"+ 
						inventory.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void addInventory() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter inventory id: ");
		int inventoryID = scanner.nextInt();
		System.out.println("ENter product id: ");
		int productID = scanner.nextInt();
		System.out.println("ENter quantityonhand: ");
		int quantityonhand = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("Insert into inventory values(?,?,?)");
			preparedStatement.setInt(1, inventoryID);
			preparedStatement.setInt(2, productID);
			preparedStatement.setInt(3, quantityonhand);
			
			preparedStatement.executeUpdate();
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void displayOrders() {
		try {
			ResultSet orders = statement.executeQuery("SELECT * from orders");
			System.out.println("orders");
			System.out.println("orderID \t orderdate \t supplierID");
			while(orders.next()) {
				System.out.println(orders.getInt(1) + "\t\t" + orders.getDate(2)+"\t\t"+ 
						orders.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayOrderDetails() {
		
		try {
			ResultSet orderdetails = statement.executeQuery("SELECT * from orderdetails");
			System.out.println("orderdetails");
			System.out.println("orderdetailID \t orderID \t productID \t quantity \t price");
			while(orderdetails.next()) {
				System.out.println(orderdetails.getInt(1) + "\t\t" + orderdetails.getInt(2)+"\t\t"+ 
						orderdetails.getInt(3)+ "\t\t" +orderdetails.getInt(4) + "\t\t"+orderdetails.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
