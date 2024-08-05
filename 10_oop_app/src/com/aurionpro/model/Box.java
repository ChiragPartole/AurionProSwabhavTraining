package com.aurionpro.model;

public class Box {
	private int width;
	private int height;
	private int depth;
	
	public Box() {
		width=10;
		height=20;
		depth=30;
	}
	
	public Box(int h,int w,int d) {
		width =w;
		height=h;
		depth=d;
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
	public void setWidth(int w) {
		width = w;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int d) {
		depth =d;
	}
	


}
