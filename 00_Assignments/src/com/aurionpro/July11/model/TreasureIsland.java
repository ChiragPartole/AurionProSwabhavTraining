package com.aurionpro.July11.model;
import java.util.Scanner;
public class TreasureIsland {
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose right or left");
		String direction = scanner.next();
		
		if(direction.equals("left")) {
			System.out.println("Choose swim or wait");
			String action = scanner.next();
			if(action.equals("wait")) {
				System.out.println("Choose which door");
				String door = scanner.next();
				if(door.equals("yellow")) {
					System.out.println("You Win!!");
				}else if(door.equals("red")) {
					System.out.println("Burned by fire, Game over");
				}else if(door.equals("blue")) {
					System.out.println("Eaten by beasts, Game over");
				}else {
					System.out.println("Game over");
				}
			}else {
				System.out.println("Attacked by Trout, Game over");
			}
		}else {
			System.out.println("Fall into hole, Game over");
		}
	}
}
