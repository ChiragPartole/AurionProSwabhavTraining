package com.aurionpro.test;

class OuterClass {
	static int outer_x = 10;
	int outer_y = 20;

	private static int outer_private = 30;

	static class StaticNestedClass {
		void display()
		{
			System.out.println("outer_x = " + outer_x);

			System.out.println("outer_private = "
							+ outer_private);

			
			OuterClass out = new OuterClass();
			System.out.println("outer_y = " + out.outer_y);
		
		
		}
	}
}

public class StaticClasses {
	public static void main(String[] args)
	{
		// accessing a static nested class
		OuterClass.StaticNestedClass nestedObject
			= new OuterClass.StaticNestedClass();

		nestedObject.display();
	}
}
