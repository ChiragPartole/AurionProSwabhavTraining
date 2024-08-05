package com.aurionpro.model;


public class Rectangle {
	private int height;
	private int width;
	
	public int area(int h, int w) {
		int ans = h*w;
		return ans;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int h) {
		width = h;
	}
	
	
	

}
