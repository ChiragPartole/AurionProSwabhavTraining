package com.techlabs.model;

public class CellAlreadyMarkedException extends RuntimeException {

	public String getMessage() {
		return "Cell is already marked";
	}
}
