package com.techlabs.behavioural.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setPacketState(new Delivered());
		System.out.println("Packet moved to next state delivered state");
		
	}

	@Override
	public void current() {
		System.out.println("Packet is in Ordered state");
		
	}

	@Override
	public void previous(Packet packet) {
		
	}

}
