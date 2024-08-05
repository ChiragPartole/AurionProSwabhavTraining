package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived1;
import com.aurionpro.model.Derived2;

public class BaseTest {

	public static void main(String[] args) {
		
		Base base1 = new Base();
		
		base1.display();
		
		base1 = new Derived1();
		base1.display();
		
		base1 = new Derived2();
		base1.display();
	}
}
