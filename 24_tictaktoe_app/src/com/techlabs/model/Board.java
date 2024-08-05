package com.techlabs.model;

public class Board {
	
	private int size;
	private char[][] board;
	public Board(int size) {
		super();
		this.size = size;
		board = new char[size][size];
		
	}


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("---");
                    if (j < size - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


	public boolean moveAllowed(int row,int col,char symbol) {
		if(board[row][col] != ' ' || row<0 || row>=board.length || col<0 || col >=board.length) {
			System.out.println("Enter correct move!");
			return false;
		}
		board[row][col] = symbol;
		return true;
	}

	
	  public boolean checkWin() {
	        // Check rows and columns
	        for (int i = 0; i < size; i++) {
	            if (checkRow(i) || checkColumn(i)) {
	                return true;
	            }
	        }
	        // Check diagonals
	        return checkDiagonalLeft() || checkDiagonalRight();
	    }

	    private boolean checkRow(int row) {
	        char first = board[row][0];
	        if (first == ' ')
	        	return false;
	        for (int j = 1; j < size; j++) {
	            if (board[row][j] != first) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private boolean checkColumn(int col) {
	        char first = board[0][col];
	        if (first == ' ')
	        	return false;
	        for (int i = 1; i < size; i++) {
	            if (board[i][col] != first) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private boolean checkDiagonalLeft() {
	        char first = board[0][0];
	        if (first == ' ') 
	        	return false;
	        for (int i = 1; i < size; i++) {
	            if (board[i][i] != first) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private boolean checkDiagonalRight() {
	        char first = board[0][size - 1];
	        if (first == ' ') 
	        	return false;
	        for (int i = 1; i < size; i++) {
	            if (board[i][size - 1 - i] != first) {
	                return false;
	            }
	        }
	        return true;
	    }


	    public boolean isDraw() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (board[i][j] != ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

		public int getSize() {
			return size;
		}
	

	    
}