package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Game;

public class GameTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of board");
		int size = scanner.nextInt();
		
		Game game = new Game();
		game.startGame(size);
	
	}

}
