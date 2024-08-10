package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SCMConnection {
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
	
	public void case1() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT  p.*,s.name FROM assignment.products p "
					+ "INNER JOIN assignment.suppliers s "
					+ "ON p.supplierID = s.supplierID;");
			
			System.out.println("productID \t name \t description \t supplierID \t name");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t" + suppliers.getString(2)+"\t"+ 
						suppliers.getString(3)+ "\t"+suppliers.getInt(4) +"\t"+ suppliers.getString(5));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case2() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT o.*,p.name from assignment.orderdetails o "
					+ "LEFT JOIN assignment.products p ON o.productID = p.productID;");
			
			System.out.println("orderDetailID \t orderID \t productID \t quantity \t price \t name");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getInt(2)+"\t\t"+ 
						suppliers.getInt(3)+ "\t\t"+suppliers.getInt(4) +"\t\t"+ suppliers.getInt(5)
						+"\t\t"+ suppliers.getString(6) );
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case3() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT s.*, p.name FROM assignment.suppliers s"
					+ " INNER JOIN assignment.products p ON p.supplierID = s.supplierID WHERE p.productID = 1;");
			
			System.out.println("supplierID \t name \t contactinfo \t addresss \t name");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t" + suppliers.getString(2)+"\t"+ 
						suppliers.getString(3)+ "\t"+suppliers.getString(4) +"\t"+ suppliers.getString(5));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case4() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT p.*,i.* FROM assignment.inventory i"
					+ " INNER JOIN assignment.products p ON i.productID = p.productID;");
			
			System.out.println("productID \t name \t\t description \t supplierId \t inventoryID \t productID"
					+ "\t quantityathand");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getString(2)+"\t\t"+ 
						suppliers.getString(3)+ "\t\t"+suppliers.getInt(4) +"\t\t"+ suppliers.getInt(5)+"\t\t"+ suppliers.getInt(6)
						+"\t\t"+ suppliers.getInt(7));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case5() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT o.*,p.* FROM assignment.orders o "
					+ "INNER JOIN assignment.products p ON o.supplierID = p.supplierID  WHERE MONTH(orderdate) = MONTH(CURRENT_DATE()) -1;");
			
			System.out.println("orderID \t oderDate \t supplierId \t productID \t name "
					+ "\t\t description \t\t supplierID");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getDate(2)+"\t\t"+ 
						suppliers.getInt(3)+ "\t\t"+suppliers.getInt(4) +"\t\t"+ suppliers.getString(5)+"\t\t"+ suppliers.getString(6)
						+"\t\t"+ suppliers.getInt(7));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case6() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT p.name,SUM(o.quantity) AS totalquantityordered FROM assignment.products p"
					+ " INNER JOIN assignment.orderdetails o ON p.productID = o.productID GROUP BY p.name;");
			
			System.out.println("name \t totalquantityordered");
			while(suppliers.next()) {
				System.out.println(suppliers.getString(1) + "\t\t" + suppliers.getInt(2));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case7() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT o.orderID, SUM(o.price*o.quantity)as amountspent "
					+ "from assignment.orderdetails o GROUP BY o.orderID;");
			
			System.out.println("orderId \t amountspent");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getInt(2));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case8() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT name,COUNT(DISTINCT supplierID) AS "
					+ "suppliercount from assignment.products GROUP BY productID HAVING suppliercount>1;");
			
			System.out.println("name \t suppliercount");
			while(suppliers.next()) {
				System.out.println(suppliers.getString(1) + "\t\t" + suppliers.getInt(2));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case9() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT p.productID,SUM(i.quatityonhand)/COUNT(p.productID) "
					+ "AS averageinventory from assignment.inventory i "
					+ "JOIN assignment.products p ON i.productID = p.productID GROUP BY p.productID;");
			
			System.out.println("productID \t averageinventory");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getDouble(2));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void case10() {
		try {
			ResultSet suppliers = statement.executeQuery("SELECT s.supplierID,s.name from assignment.suppliers s"
					+ " LEFT JOIN assignment.products p ON s.supplierID = p.supplierID WHERE p.supplierID IS NULL;");
			
			System.out.println("supplierId \t name");
			while(suppliers.next()) {
				System.out.println(suppliers.getInt(1) + "\t\t" + suppliers.getString(2));
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
}
