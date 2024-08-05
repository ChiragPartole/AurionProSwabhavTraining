package com.techlabs.behavioural.state.model;

public class Received implements IPacketState{

	@Override
	public void next(Packet packet) {
		
		System.out.println("Packet moved to delivered state");
		
	}

	@Override
	public void current() {
		System.out.println("Packet is in received state");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Delivered());
		System.out.println("Packet moved to previous state delivered");
		
	}

}
