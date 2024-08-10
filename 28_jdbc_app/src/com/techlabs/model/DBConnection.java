package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public void connectToDb() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			
			statement = connection.createStatement();
			
			
			System.out.println("Connection sucessfull");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getStudentDetails() {

		try {
			ResultSet dbData = statement.executeQuery("SELECT * from students");
		
			connection.setAutoCommit(false);
			System.out.println("auto commit set to false");
			
			connection.commit();
			System.out.println("commit done");
			
			
			while(dbData.next()) {
				try {
					System.out.println(dbData.getInt("rollnumber") + "\t" + dbData.getString(2) +"\t"+ dbData.getDouble(3) );
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void savePoint() {
		try {
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("Insert into students values(100,'abc',70)");
			preparedStatement.execute();
//			Savepoint savepoint1 = connection.setSavepoint("savepoint1");
			System.out.println("savepoint created");
			preparedStatement = connection.prepareStatement("Insert into students values(101,'xyz',99)");
			preparedStatement.execute();
			getStudentDetails();
			connection.rollback();
			System.out.println("Rollback done");
			connection.commit();
			getStudentDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void batchProcessing() {
		try {
			statement.addBatch("Insert into students values(10,'abc',70)");
			statement.addBatch("Insert into students values(11,'pqr',75)");
			statement.addBatch("Insert into students values(12,'xyz',80)");
			
			statement.executeBatch();
			System.out.println("Batch processing done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addStudents() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter roll number: ");
		int rollnumber = scanner.nextInt();
		System.out.println("ENter name: ");
		String name = scanner.next();
		System.out.println("ENter percentage: ");
		double percentage = scanner.nextDouble();
		
		try {
			preparedStatement = connection.prepareStatement("Insert into students values(?,?,?)");
			preparedStatement.setInt(1, rollnumber);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, percentage);
			preparedStatement.executeUpdate();
			
//			statement.executeUpdate("Insert into students values ("+rollnumber+",'"+name+"',"+percentage+")");
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateStudents() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter roll number you want to update: ");
		int updateNumber = scanner.nextInt();
		
		System.out.println("ENter name: ");
		String name = scanner.next();
		System.out.println("ENter percentage: ");
		double percentage = scanner.nextDouble();
		
		try {
			preparedStatement = connection.prepareStatement("UPDATE students SET name = ?"
					+ ",percentage=? WHERE rollnumber=?");
			preparedStatement.setString(1, name);
			preparedStatement.setDouble(2, percentage);
			preparedStatement.setInt(3, updateNumber);
			preparedStatement.executeUpdate();
			
			System.out.println("Update done successfully!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
