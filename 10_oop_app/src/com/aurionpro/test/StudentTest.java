package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rollNo;
		String name;
		int age;
		Double percentage;
		
		Student student1 = new Student();
		
		System.out.println("Enter name: ");
		student1.setName(scanner.next());
		
		System.out.println("Enter Roll Number: ");
		student1.setRollNo(scanner.nextInt());
		
		System.out.println("Enter age: ");
		student1.setAge(scanner.nextInt());
		
		System.out.println("Enter percentage: ");
		student1.setPercentage(scanner.nextDouble());
		
		System.out.println("Name: "+student1.getName());
		System.out.println("Roll Number: "+student1.getRollNo());
		System.out.println("Age: "+student1.getAge());
		System.out.println("Percentage: "+student1.getPercentage());
		
		Student student2 = new Student();
		
		System.out.println("Enter name: ");
		student2.setName(scanner.next());
		
		System.out.println("Enter Roll Number: ");
		student2.setRollNo(scanner.nextInt());
		
		System.out.println("Enter age: ");
		student2.setAge(scanner.nextInt());
		
		System.out.println("Enter percentage: ");
		student2.setPercentage(scanner.nextDouble());
		
		System.out.println("Name: "+student2.getName());
		System.out.println("Roll Number: "+student2.getRollNo());
		System.out.println("Age: "+student2.getAge());
		System.out.println("Percentage: "+student2.getPercentage());

	}

}
