package com.aurionpro.model;

public class BoxWeight extends Box{
	
	private int weight;
	
	public BoxWeight(int weight, int width,int height,int depth) {
		super(width,height,depth);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Width()=" + getWidth() + ",Height()=" + getHeight()
				+ ", Depth()=" + getDepth() + "]";
	}

}
