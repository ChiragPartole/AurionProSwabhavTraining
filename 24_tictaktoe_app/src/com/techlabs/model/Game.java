package com.techlabs.model;

import java.util.Scanner;

public class Game {
	
	private Board board;
	private Player player1;
	private Player player2;
	private Player currentPlayer;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void startGame(int size) {
		
		
		board = new Board(size);
		
		System.out.println("Enter player1 symbol: ");
		char symbol1 = scanner.next().charAt(0);
		player1 = new Player(symbol1);
		
		System.out.println("Enter player2 symbol: ");
		char symbol2 = scanner.next().charAt(0);
		player2 = new Player(symbol2);
		
		currentPlayer = player1;
		System.out.println("Current player is player "+currentPlayer.getSymbol());
		
		System.out.println("Starting game");
		board.printBoard();
		play();
		
	}
	
	private void play() {
		
		
		while(true) {
			System.out.println("Player '" + currentPlayer.getSymbol() + " ' , "
					+ "enter your move (row[0- "+ board.getSize()+"] column[0- "+ board.getSize()+"]: ");
			
			int row = scanner.nextInt() ;
			int col = scanner.nextInt();
			if(row <0 || row >=board.getSize()+1 || col <0 || col>=board.getSize()+1) {
				System.out.println("Enter correct move!");
			}
			if(board.moveAllowed(row, col,currentPlayer.getSymbol() )) {
				board.printBoard();
				if(board.checkWin()) {
					System.out.println("Player " + currentPlayer.getSymbol()+ " wins!");
					break;
				}
				if(board.isDraw()) {
					System.out.println("Draw!");
					break;
				}
				if(currentPlayer == player1) {
					currentPlayer = player2;
				}else {
					currentPlayer = player1;
				}
			}
			
		}
	}
	
	

}
