package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class stringClass = Class.forName("java.lang.String");

		
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getTypeName());
		
		Method stringMethods[] = stringClass.getMethods();
		
		for(Method method : stringMethods) 
		{
			System.out.println("method name: "+method.getName()+
					"\t number of parameters: "+method.getParameterCount());
			
		}
		
		System.out.println();
		Constructor stringConstructors[] = stringClass.getConstructors();
		
		
		for(Constructor constructor: stringConstructors)
		{
			System.out.println("constructor name: " +constructor.getName() +
					"\t\t number of parameters: " + constructor.getParameterCount());
		}
	}

}
