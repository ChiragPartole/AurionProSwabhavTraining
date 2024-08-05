package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of players: ");
		int size = scanner.nextInt();
		CricketPlayer players[] = new CricketPlayer[size];
		
		for(int i=0; i<players.length;i++) {	

		System.out.println("Enter player id: ");
		int playerId =scanner.nextInt();
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("ENter number of matches: ");
		int numberOfMatches = scanner.nextInt();
		System.out.println("ENter runs: ");
		int runs = scanner.nextInt();
		System.out.println("Enter number fo wickets: ");
		int numberOfWickets = scanner.nextInt();
		
		players[i]= new CricketPlayer(playerId,name,numberOfMatches,runs,numberOfWickets);
		System.out.println("------------------");
		}
		
		System.out.println("Before displayPlayers()");
		for(int i=0; i<players.length;i++) {
			players[i].display();
			
		}
		System.out.println("After displayPlayers()");
		displayPlayers(players);
		
	}
	
	private void getMaximumAveragePlayer(CricketPlayer players[]) {
		double maximum =0;
		int index =0;
		for(int i=0; i<players.length;i++) {
			if(players[i].calculateAverage()> maximum) {
				maximum = players[i].calculateAverage();
				index =i;
			}
		}
		players[index].display();
	}
	
	private static void displayPlayers(CricketPlayer players[]) {
		int[] indexes = new int[players.length];
		
//		Arrays.sort(players,(a,b) -> Double.compare(a.calculateAverage(), b.calculateAverage()));
		
//		Arrays.sort(players, new Comparator<CricketPlayer>() {
//			@Override
//			public int compare(CricketPlayer o1, CricketPlayer o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.calculateAverage() - o2.calculateAverage());
//			}
//		});
		
		for(int i=0; i<players.length;i++) {
			for(int j=0; j<players.length-i-1; j++) {
				if(players[j].calculateAverage() > players[j+1].calculateAverage()) {
					CricketPlayer temp = players[j];
					players[j] = players[j+1];
					players[j+1] = temp;
				}
			}
		}
		
		
		for(int i=0; i<players.length;i++) {
			players[i].display();	
		}
	}

}
