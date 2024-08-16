package com.techlabs.model;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class HardDisk {
	private int capacity;

	public HardDisk() {
	System.out.println("Harddisk constructor is called ");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		System.out.println("inside setCapacity");
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Hardware [capacity=" + capacity + "]";
	}
	
}
