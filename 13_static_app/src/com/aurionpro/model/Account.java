package com.aurionpro.model;

public class Account {
	private int id;
	static private int count;
	
	

	public void display(){
		System.out.println("Account [id=" + id + "]");
	}

	{
		count++;
		System.out.println("Account "+count+" is created");
	}


	public Account(int id) {
		this.id = id;
	}
}
