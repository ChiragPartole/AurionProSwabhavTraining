package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Student;
import com.techlabs.model.StudentComparator;


public class StudentsTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 
		List<Student> students = new ArrayList<Student>();
	
		readStudents(students,scanner);
		displayStudents(students);
		
		System.out.println("After sorting names ");
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		displayStudents(students);
		
		System.out.println("After sorting roll number ");
		Collections.sort(students, new StudentComparator.StudentRollNumberComparator());
		displayStudents(students);
		
		System.out.println("After sorting percentage ");
		Collections.sort(students, new StudentComparator.StudentRollNumberComparator());
		displayStudents(students);

	}

	private static void displayStudents(List<Student> students) {
		for(Student student: students)
			System.out.println(student);
	}

	private static void readStudents(List<Student> students, Scanner scanner) {
		int rollNumber;
		String name;
		double percentage;
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter details of Student"+(i+1));
			System.out.println("ENter name:");
			name = scanner.next();
			
			System.out.println("Enter roll number");
			rollNumber = scanner.nextInt();
			
			System.out.println("Enter percentage");
			percentage = scanner.nextDouble();
			
			students.add(new Student(rollNumber,name,percentage));
			
		}
		
	}

}
