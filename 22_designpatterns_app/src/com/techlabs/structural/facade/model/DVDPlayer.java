package com.techlabs.structural.facade.model;

public class DVDPlayer {

	public void on()
	{
		System.out.println("dvd player is on");
		
	}
	
	public void play(String movie)
	{
		System.out.println(movie + " is playing");
	}
}
