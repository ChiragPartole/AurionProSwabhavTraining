package com.techlabs.creational.prototype.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.techlabs.creational.prototype.model.Bus;
import com.techlabs.creational.prototype.model.Car;
import com.techlabs.creational.prototype.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {

        List<Vehicle> vehicles = Arrays.asList(
                new Car("car_brand", "car_model", "car_color", 300),
                new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }
        
        for (Vehicle vehicle : copyList) {
            System.out.println(vehicle);
        }
        
        Vehicle car1 = new Car("car", "car_model", "car_color", 100);
        Vehicle car2 = car1.clone();
        System.out.println(car1);
        System.out.println(car2);
	}

}