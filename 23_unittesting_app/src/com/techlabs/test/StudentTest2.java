package com.techlabs.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.main.IStudentService;
import com.techlabs.main.Student;

class StudentTest2 {
	
	private IStudentService studentService ;
	Student student;
	@BeforeEach
	void init(){
		studentService= Mockito.mock(IStudentService.class) ;
		student= new Student(studentService);
	}

	@Test
	void testCalculatPercentage() {
		Mockito.when(studentService.getMarks()).thenReturn(650);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10);	
		
		assertEquals(10.0, student.calculatePercentage());
		
		
	}

}