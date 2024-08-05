package com.techlabs.structural.proxy.test;

import com.techlabs.structural.proxy.model.IStudent;
import com.techlabs.structural.proxy.model.ProxyStudent;


public class StudentTest {

	 public static void main(String[] args) {
	        IStudent student = new ProxyStudent("Alice", 123);
	        
	        student.getDetails();
	        
	        
	    }
	}