package com.techlabs.structural.facade.model;

public class HomeTheaterFacade {
	
	private DVDPlayer dvdPlayer ;
	private Projector projector;
	private SoundSystem soundSystem;
	
	public void watchMovie(String movie)
	{
		projector = new Projector();
		projector.on();
		
		soundSystem = new SoundSystem();
		soundSystem.on();
		soundSystem.setVolume(6);
		
		dvdPlayer =  new DVDPlayer();
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

}
