package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Car;

public class CarTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENter number of cars:");
		int size = scanner.nextInt();
		List<Car> cars = new ArrayList<Car>();
		
		readCars(cars,scanner,size);
		displayCars(cars);
		
		maximumMileageCar(cars);
		

	}

	private static void maximumMileageCar(List<Car> cars) {
		double maxMileage=0;
		int index =0;
		for(int i=0; i<cars.size();i++) {
			if(cars.get(i).getMileage() > maxMileage) {
				maxMileage = cars.get(i).getMileage();
				index =i;
			}
		}
		
		System.out.println("car with max mileage is: ");
		System.out.println(cars.get(index));
		
	}

	private static void displayCars(List<Car> cars) {
		for(Car car: cars)
			System.out.println(car);
	}

	private static void readCars(List<Car> cars, Scanner scanner , int size) {
		int carId;
		String carName;
		double price;
		double mileage;
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter details of car"+(i+1));
			System.out.println("Enter carId");
			carId = scanner.nextInt();
			System.out.println("ENter name:");
			carName = scanner.next();
			System.out.println("Enter price");
			price = scanner.nextDouble();
			System.out.println("Enter mileage");
			mileage = scanner.nextDouble();
			
			cars.add(new Car(carId,carName,price,mileage));
			
		}
		
	}

}
