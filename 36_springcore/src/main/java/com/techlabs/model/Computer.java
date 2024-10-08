package com.techlabs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	@Value("apple")
	private String name;
	
	@Autowired
	private HardDisk harddisk;
	
	public Computer() {
		
	}
	public Computer(String name, HardDisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
	}
	
	
}
