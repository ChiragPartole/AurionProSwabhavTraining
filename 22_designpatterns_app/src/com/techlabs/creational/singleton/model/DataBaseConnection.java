package com.techlabs.creational.singleton.model;

public class DataBaseConnection {
	
	private static DataBaseConnection dataBaseConnection;
	
	private DataBaseConnection() {
		System.out.println("Connected to db");
	}
	
	public static DataBaseConnection getdataBaseConnection()
	{
		if(dataBaseConnection ==null)
			dataBaseConnection = new DataBaseConnection();
		return dataBaseConnection;
	}

	public void status() {
		System.out.println("db connected sucessful");
	}
}
