package com.techlabs.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> squareFunction = (Integer number) -> number*number;
		
		System.out.println(squareFunction.apply(4));
		
		BiFunction<Integer,Integer,Integer> multiplyFunction = (Integer number1,Integer number2) -> number1*number2;
		System.out.println(multiplyFunction.apply(10, 20));

	}

}
