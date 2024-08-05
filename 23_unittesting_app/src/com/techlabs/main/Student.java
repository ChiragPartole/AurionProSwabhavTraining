package com.techlabs.main;

public class Student {

	private IStudentService studentService;
	
	

	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}



	public double calculatePercentage() {
		return (studentService.getMarks()/studentService.getNumberOfSubjects())*100;
	}
}
