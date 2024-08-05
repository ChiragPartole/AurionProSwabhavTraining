package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1 = new Demo();
		System.out.println("before increment() demo1: ");
		demo1.display();
		demo1.increment();
		System.out.println("after increment() demo1:");
		demo1.display();
		
		Demo demo2 = new Demo();
		System.out.println("before increment()demo2: ");
		demo2.display();
		demo2.increment();
		System.out.println("after increment()demo2: ");
		demo2.display();
		
		Demo demo3 = new Demo();
		System.out.println("before increment()demo3: ");
		demo3.display();
		demo3.increment();
		System.out.println("after increment()demo3: ");
		demo3.display();
		
		

	}

}
