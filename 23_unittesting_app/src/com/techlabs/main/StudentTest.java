package com.techlabs.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	 
	 private IStudentService studentService ;
	 Student student;
	 @BeforeEach
	 void init(){
	  studentService= Mockito.mock(IStudentService.class) ;
	  student= new Student(studentService);
	 }

	 @Test
	 void testCalculatPercentage() {
	  Mockito.when(studentService.getMarks()).thenReturn(100);
	  Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10); 
	  
	  assertEquals(10.0, student.calculatePercentage());
	  
	  
	 }

	}