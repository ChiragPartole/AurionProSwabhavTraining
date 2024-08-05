package com.techlabs.behavioural.state.test;

import com.techlabs.behavioural.state.model.Ordered;
import com.techlabs.behavioural.state.model.Packet;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packet packet = new Packet(new Ordered());
		
		packet.printCurrentStatus();
		
		packet.goToNextState();
		packet.printCurrentStatus();
		
		packet.goToNextState();
		packet.printCurrentStatus();
		
		packet.goToPreviousState();
		packet.printCurrentStatus();

	}

}
