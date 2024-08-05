package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
			double result = number1/number2;
			System.out.println("Division is: "+ result);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("INvalid input fo rnumber 2, number 2 cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("division requires 2 arguments, please enter two values");
		}
		catch(NumberFormatException exception)
		{
			System.out.println("Please enter number value");
		}
		catch(Exception exception) {
			System.out.println(exception +" occured");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Exiting");	
		}

}
