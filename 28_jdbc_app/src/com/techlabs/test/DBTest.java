package com.techlabs.test;

import com.techlabs.model.DBConnection;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection connection = new DBConnection();
		
		connection.connectToDb();
//		connection.getStudentDetails();
//		connection.addStudents();
//		connection.getStudentDetails();
//		connection.updateStudents();
//		connection.getStudentDetails();
		
//		connection.batchProcessing();
//		connection.getStudentDetails();
		
		connection.savePoint();

	}

}
