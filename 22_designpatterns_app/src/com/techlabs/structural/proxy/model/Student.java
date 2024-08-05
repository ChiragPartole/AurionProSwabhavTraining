package com.techlabs.structural.proxy.model;

public class Student implements IStudent{
	private String name;
	private int rollNumber;
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		System.out.println("This is constructor of student");
	}
	

	
	@Override
	public void getDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}
}
