package com.aurionpro.selection.test;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch(choice)
        {
        case 1: System.out.println(((temperature*9/5) + 32) + " F");
        break;
        case 2: System.out.println(((temperature-32)/1.8) +" C");
        break;
        case 3: System.out.println((temperature+273.15) + " K");
        break;
        case 4: System.out.println((temperature-273.15) + " C");
        break;
        case 5: System.out.println(((temperature-32)/1.8 + 273.15) + " K");
        break;
        case 6: System.out.println((1.8*(temperature-273.15)+32) +" F");
        break;
        default: System.out.println("Invalid");
        }

	}

}
