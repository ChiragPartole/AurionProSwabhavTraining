package com.techlabs.model;


public class Computer {
	
	private HardDisk harddisk;
	private String name;
	public Computer(HardDisk harddisk, String name) {
		
		super();
		this.harddisk = harddisk;
		this.name = name;
		System.out.println("parametrised constructor is called");
	}
	public Computer(){
		System.out.println("default computer constructor is called");
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(HardDisk harddisk) {
		System.out.println("setHarddisk is called");
		this.harddisk = harddisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Computer [harddisk=" + harddisk + ", name=" + name + "]";
	}

	
}