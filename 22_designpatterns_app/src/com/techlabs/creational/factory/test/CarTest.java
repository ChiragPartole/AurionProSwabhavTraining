package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.CarNames;
import com.techlabs.creational.factory.model.ICar;

public class CarTest {

	public static void main(String[] args) {
		ICar maruti = CarFactory.makeCar(CarNames.Maruti);
		maruti.start();
		maruti.stop();
		
		ICar tata =CarFactory.makeCar(CarNames.Tata);
		tata.start();
		tata.stop();
		
		ICar mahindra =CarFactory.makeCar(CarNames.Mahindra);
		mahindra.start();
		mahindra.stop();
		
		
		

	}

}
