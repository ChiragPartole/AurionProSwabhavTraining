package com.techlabs.test;

import com.techlabs.model.ISayable;

public class SayableTest {

	public static void main(String[] args) {

		ISayable sayable = () -> System.out.println("inside sayable" );
		
		sayableHello(sayable);
	}

	private static void sayableHello(ISayable sayable) {
		sayable.say();
		
	}

}
