package com.techlabs.structural.facade.model;

public class IndianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Indian menu");
		System.out.println("1. Pakora  \n2. Chaat  \n3. Vada Pav  \n4. Idli  "
				+ "\n5. Paratha  \n6. Naan  \n7. Aloo Gobi \n8. Butter Chicken.");
		System.out.println("----------------------------");
		
	}

}
