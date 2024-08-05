package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.DataBaseConnection;


public class DataBaseConnectionTest {

	public static void main(String[] args) {
		
		DataBaseConnection dataBaseConnection1 = DataBaseConnection.getdataBaseConnection();
		dataBaseConnection1.status();
		System.out.println(dataBaseConnection1.hashCode());
		
		DataBaseConnection dataBaseConnection2 = DataBaseConnection.getdataBaseConnection();
		dataBaseConnection2.status();
		System.out.println(dataBaseConnection2.hashCode());

	}

}
