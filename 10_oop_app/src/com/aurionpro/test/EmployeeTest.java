package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName;
		int empId;
		int salary;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of employees: ");
		int numberOfEmployees = scanner.nextInt();
		
		Employee employees[] = new Employee[numberOfEmployees];
		
		for(int i=0; i<employees.length;i++) {
			System.out.println("Enter employee ID: ");
			empId = (scanner.nextInt());
			
			System.out.println("Enter name: ");
			 empName = (scanner.next());
			
			System.out.println("Enter salary: ");
			 salary = (scanner.nextInt());
			
			employees[i] = new Employee(empId,empName,salary); //parameterised constructer
			System.out.println("----------------------------------");
			
		}
		
		for(int i=0; i<employees.length;i++) {
		System.out.println("Details of Employee"+i);
		System.out.println("Employee ID: "+ employees[i].getEmpId());
		System.out.println("Employee name: "+ employees[i].getEmpname());
		System.out.println("Employee salary: "+ employees[i].getSalary());
		System.out.println("----------------------------------------");
		}
		
		
		
		
		

	}

}
