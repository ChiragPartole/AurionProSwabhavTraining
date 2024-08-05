package com.aurionpro.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	public CricketPlayer() {
		playerId = 10;
		name = "abc";
		numberOfMatches = 0;
		runs = 0;
		numberOfWickets =0;
	}
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs,int numberOfWickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
	}
	
	public int getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfMatches() {
		return this.numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
	public int getRuns() {
		return this.runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getNumberOfWickets() {
		return this.numberOfWickets;
	}
	public void setNumberOfWickets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	public void display() {
		System.out.println("Player ID: "+this.playerId);
		System.out.println("Name: "+this.name);
		System.out.println("Number of Matches: "+this.numberOfMatches);
		System.out.println("Runs: "+this.runs);
		System.out.println("Number of Wickets: "+this.numberOfWickets);
		System.out.println("Average : "+ this.runs/this.numberOfMatches);
		System.out.println("-----------------------");
	}
	
	public double calculateAverage() {
		return (this.runs/this.numberOfMatches);
	}
	
	

}
