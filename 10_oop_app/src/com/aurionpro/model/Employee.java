package com.aurionpro.model;

public class Employee {
	
	private int empId;
	private String empName;
	private int salary;
	
	public Employee() {
		empId =10;
		empName = "abc";
		salary = 500;
	}
	
	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return this.empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpname() {
		return this.empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
