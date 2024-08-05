package com.techlabs.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Integer> randomNoSupplier = ()-> (int) (Math.random()*1000);

		int number = randomNoSupplier.get();
		System.out.println(number);
	}

}
