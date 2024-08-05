package com.techlabs.structural.facade.model;

public class ItalianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Italian menu");
		System.out.println("1. Spaghetti alla Carbonara.\n" + 
				"2. Napoletana Pizza.\n" + 
				"3. Risotto.\n" + 
				"4. Arancini.\n" + 
				"5. Fiorentina Steak.\n" + 
				"6. Polenta.\n" + 
				"7. Ossobuco.\n" + 
				"8. Truffles.");
		
	}

}
