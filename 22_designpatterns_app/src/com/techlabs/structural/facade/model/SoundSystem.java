package com.techlabs.structural.facade.model;

public class SoundSystem {
	public void on()
	{
		System.out.println("sound system is on");
	}

	public void setVolume(int level)
	{
		System.out.println("volume is set to "+ level);
	}
}
