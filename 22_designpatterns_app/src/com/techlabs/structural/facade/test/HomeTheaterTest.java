package com.techlabs.structural.facade.test;

import com.techlabs.structural.facade.model.HomeTheaterFacade;

public class HomeTheaterTest {

	public static void main(String[] args) {


		HomeTheaterFacade homeTheater = new HomeTheaterFacade();
		
		homeTheater.watchMovie("Avengers");
		

	}

}