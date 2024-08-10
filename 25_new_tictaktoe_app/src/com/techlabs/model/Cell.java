package com.techlabs.model;

public class Cell {

	private MarkType mark;

	
	public Cell(MarkType mark) {
		super();
		this.mark = MarkType.EMPTY;
	}
	
	
	public MarkType getMark() {
		return mark;
	}


	//make changes
	public void setMark(MarkType mark) {
//		if(mark != mark.EMPTY)
//			throw new CellAlreadyMarkedException();
		this.mark = mark;
	}


	//public boolean isEmpty() 
		
	
	
}
