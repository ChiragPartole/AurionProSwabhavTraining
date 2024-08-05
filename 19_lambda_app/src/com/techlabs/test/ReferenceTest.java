package com.techlabs.test;

import com.techlabs.model.Reference;
import com.techlabs.model.Test;

public class ReferenceTest {

	public static void main(String[] args) {
		
		Test test1 = Reference::new;  //constructor is referenced
		method(test1);
		
		Test test2 = Reference::staticPrint;   //static method is called
		method(test2);
		
		Reference reference = new Reference();
		Test test3 = reference :: print;          //non static method is called
		method(test3);
		

	}
	
	static void method(Test test) {
		test.display();
	}

}
