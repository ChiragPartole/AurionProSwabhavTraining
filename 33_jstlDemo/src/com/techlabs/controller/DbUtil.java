package com.techlabs.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.entity.Student;

public class DbUtil {

	private Connection connection;
	private Statement statement;
	private static DbUtil dbUtil;
	
	private DbUtil() {
		
	}
	
	public static DbUtil getDbUtil() {
		if(dbUtil == null)
			dbUtil = new DbUtil();
		return dbUtil;
	}
	
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
	
	public List<Student> getAllStudents() {
		ResultSet dbUsers = null;
		List<Student> students = new ArrayList<Student>();
		try {
			dbUsers = statement.executeQuery("SELECT * from students");
			
			while(dbUsers.next()) {
				students.add(new Student(dbUsers.getInt(1),dbUsers.getString(2),dbUsers.getDouble(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	
//	public boolean validateCredentials(String username, String password) { 
//		ResultSet dbUsers = getAllUsers();
//	try {  
//		while(dbUsers.next()) {
//			if(dbUsers.getString("username").equals(username))
//				if(dbUsers.getString("userpassword").equals(password))
//				return true;
//			}
//	}catch (SQLException e) 
//	{    
//		e.printStackTrace();
//	} 
//	return false;
//	}
	
}
