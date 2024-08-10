package com.techlabs.model;

public class Board {

	MarkType[] cell = new MarkType[9];
 
	public Board(MarkType[] cell) {
		super();
		for(int i=0;i<cell.length;i++)
			cell[i] = MarkType.EMPTY;
	}
	
	public boolean isBoardFull() {
		for (int i = 0; i < cell.length; i++) {
                if (cell[i] == null) {
                    return false; 
            }
        }
        return true;
    }
	
	public void setCellMark(int loc,MarkType mark) {
		if(loc<0 || loc>9) {
			System.out.println("Enter valid location");
			return;
		}
		
		if(cell[loc] != MarkType.EMPTY) {
			throw new CellAlreadyMarkedException();
		}
		cell[loc] = mark;
	}

	public MarkType[] getCell() {
		return cell;
	}
	
	
}
