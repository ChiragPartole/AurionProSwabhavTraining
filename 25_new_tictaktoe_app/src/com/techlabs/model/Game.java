package com.techlabs.model;

public class Game {

	private Player currentPlayer;
	private Player[] players;
	private Board board;
	private ResultAnalyzer analyzer;
	private ResultType result = ResultType.PROGRESS;
	public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
		super();
		this.players = players;
		this.board = board;
		this.analyzer = analyzer;
		
	}
	
	public void play(int loc) {
		
	}
	
	private void switchPlayers() {
		
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	
}
