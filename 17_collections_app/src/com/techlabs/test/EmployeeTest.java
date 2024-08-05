package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeComparator;


public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
				
		readEmployees(employees,scanner);
		displayEmployees(employees);
		
		System.out.println("After sorting names ");
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		displayEmployees(employees);
		
		System.out.println("After sorting employee id ");
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		displayEmployees(employees);
		
		System.out.println("After sorting percentage ");
		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		displayEmployees(employees);

	}

	private static void displayEmployees(ArrayList<Employee> employees) {
		for(Employee employee: employees)
			System.out.println(employee);
	}

	private static void readEmployees(ArrayList<Employee> employees, Scanner scanner) {
		int rollNumber;
		String name;
		double percentage;
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter details of employee"+(i+1));
			System.out.println("ENter name:");
			name = scanner.next();
			
			System.out.println("Enter emp id");
			rollNumber = scanner.nextInt();
			
			System.out.println("Enter salary");
			percentage = scanner.nextDouble();
			
			employees.add(new Employee(rollNumber,name,percentage));
			
		}
		
	}

}
