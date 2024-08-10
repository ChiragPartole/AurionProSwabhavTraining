package com.techlabs.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	public ResultAnalyzer(Board board, ResultType result) {
		super();
		this.board = board;
		this.result = result;
	}
	
	MarkType[] cell = board.getCell();
	private void horizontalWinCheck() {
		for(int i=0; i<cell.length;i++) {
			
		}
	}
	
	private void verticalWinCheck() {
		
	}
	
	
	public ResultType analyzeResult() {
		
	}

	public Board getBoard() {
		return board;
	}

	public ResultType getResult() {
		return result;
	}
	
	

}
