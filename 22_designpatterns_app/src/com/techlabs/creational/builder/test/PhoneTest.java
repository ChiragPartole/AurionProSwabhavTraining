package com.techlabs.creational.builder.test;


import com.techlabs.creational.builder.model.Phone;
import com.techlabs.creational.builder.model.PhoneBuilder;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setBattery(3000).setRam(6).getPhone();
		
		System.out.println(phone);
		

	}

}
