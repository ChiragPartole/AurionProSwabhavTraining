package com.techlabs.creational.abstractfactory.test;

import com.techlabs.creational.abstractfactory.model.ICar;
import com.techlabs.creational.abstractfactory.model.ICarFactory;
import com.techlabs.creational.abstractfactory.model.MahindraFactory;
import com.techlabs.creational.abstractfactory.model.MarutiFactory;
import com.techlabs.creational.abstractfactory.model.TataFactory;

public class CarTest {

	public static void main(String[] args) {
		ICarFactory marutiFactory = new MarutiFactory();
		ICar maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();

		
		ICarFactory mahindraFactory = new MahindraFactory();
		ICar mahindra = mahindraFactory.makeCar();
		mahindra.start();
		mahindra.stop();
		
		ICarFactory tataFactory = new TataFactory();
		ICar tata = tataFactory.makeCar();
		tata.start();
		tata.stop();
	}
	
	

}
