package com.aurionpro.model;
import java.util.Scanner;
public class Calculator {
	
	public static int Add(int num1,int num2) {
		return num1+num2;
	}
	
	public static int Sub(int num1,int num2) {
		return num1-num2;
	}
	
	public static int Multi(int num1,int num2) {
		return num1*num2;
	}
	
	public static float Div(float num1,float num2) {
		return num1/num2;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number");
	int num2 = sc.nextInt();
	
	System.out.println("The addition of "+ num1 + " and " + num2 + " is-> " + Add(num1,num2));
	System.out.println("The subtraction of "+ num1 + " and " + num2 + " is-> " + Sub(num1,num2));
	System.out.println("The multiplication of "+ num1 + " and " + num2 + " is-> " + Multi(num1,num2));
	System.out.println("The division of "+ num1 + " and " + num2 + " is-> " + Div(num1,num2));
}
}
