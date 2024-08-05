package com.aurionpro.July11.model;

import java.util.Random;
import java.util.Scanner;

public class PIG {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		Scanner scanner = new Scanner(System.in);
	
		int score =0;
		int turn = 1;
		
		while(score<20) {
			boolean turnOver = false;
			int turnScore =0;
			System.out.println("Turn "+turn);
			
			while(turnOver == false) {
				System.out.println("Roll or hold?(r/h)");
				char die = scanner.next().charAt(0);
				if(score>20) {
					turnOver = true;
				}
				if(die == 'r') {
					int number = rand.nextInt(6)+1;
					System.out.println("Die: "+number);
					if(number==1) {
						System.out.println("Turn over. No score");
						score =0;
						turnOver =true;
					}else {
						turnScore = turnScore + number;
						score = score +number;
					}
				}else if(die == 'h') {
					int number = rand.nextInt(6)+1;
					System.out.println("Score for turn: "+ turnScore);
					
					turnOver = true;
					System.out.println("Total score: "+score);
				}
				
			}
			turn++;
		}
		System.out.println("You finished in "+(turn-1)+ " turns \n Game over!");
		
		
	}

}
