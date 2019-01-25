package com.au.Model;

public class Apartment extends Building {
	private int floors;
    private int rooms;
    private int rate;
	public int getFLOORS() {
		return floors;
	}
	public int getROOMS() {
		return rooms;
	}
	public int getRATE() {
		return rate;
	}
	public Apartment(int floors, int rooms, int rate) {
		
		this.floors = floors;
		this.rooms = rooms;
		this.rate = rate;
	}
     

}
