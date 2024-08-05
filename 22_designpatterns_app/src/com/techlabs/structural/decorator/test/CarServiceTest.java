package com.techlabs.structural.decorator.test;

import com.techlabs.structural.decorator.model.CarInspection;
import com.techlabs.structural.decorator.model.ICarService;
import com.techlabs.structural.decorator.model.OilChange;
import com.techlabs.structural.decorator.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange oilChange = new OilChange(car);
		WheelAlign wheelAlign = new WheelAlign(oilChange);
		
		System.out.println(wheelAlign.getCost());
	}

}