package com.aurionpro.selection.test;
import java.util.Scanner;
public class WaterBillCalculator {
	public static void main(String[] args) {
		int meter_charge = 75;
		int charge =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no_of_units: ");
		int no_of_units = scanner.nextInt();
		if(no_of_units <= 100) {
			charge = no_of_units * 5;
		}else {
			if(no_of_units <=250) {
				int extra_units = no_of_units - 100;
				charge = 10 * extra_units;
				charge += 500;
			}else {
				int extra_units= no_of_units - 250;
				charge = 20* extra_units;
				charge += 500 +1500;
			}
		}
		int total_water_bill = charge + meter_charge;
		System.out.println("Total water bill is: "+ total_water_bill);

	}

}
