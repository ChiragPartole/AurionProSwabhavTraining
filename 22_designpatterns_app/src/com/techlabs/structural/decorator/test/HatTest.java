package com.techlabs.structural.decorator.test;

import com.techlabs.structural.decorator.model.GoldenHat;
import com.techlabs.structural.decorator.model.IHat;
import com.techlabs.structural.decorator.model.StandardHat;

public class HatTest {

	public static void main(String[] args) {
		IHat hat = new StandardHat();
		GoldenHat goldenHat = new GoldenHat(hat);
		
		System.out.println(goldenHat.getName());
		System.out.println(goldenHat.getPrice());
		System.out.println(goldenHat.getDescription());
		
	}
}
