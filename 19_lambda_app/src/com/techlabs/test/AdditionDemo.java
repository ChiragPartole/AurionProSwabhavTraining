package com.techlabs.test;

import java.util.function.BiConsumer;

import com.techlabs.model.IAddition;

public class AdditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAddition adder = (int number1, int number2) -> number1 +number2;
		
		
		BiConsumer<Integer,Integer> adderBiConsumer = (Integer number1,Integer number2) ->{
			System.out.println("Addition "+ number1 + "+" + number2+"="+(number1+number2));
		};
		
		
		adderBiConsumer.accept(10, 20);
		System.out.println(adder.addition(10, 20));

	}

}
