package com.techlabs.behavioural.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setPacketState(new Received());
		System.out.println("Packet moved to next state received");
		
	}

	@Override
	public void current() {
		System.out.println("Packet is in delivered state");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Ordered());
		System.out.println("Packet moved to next state ordered");
		
	}

}
