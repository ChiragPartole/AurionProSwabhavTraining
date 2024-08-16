package com.techlabs.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {

	@Value("10")
	private int capacity;

	public HardDisk() {
		
	}
	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}
	
	
}
