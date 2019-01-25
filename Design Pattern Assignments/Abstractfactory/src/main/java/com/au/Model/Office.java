package com.au.Model;

public class Office extends Building {
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
	public Office(int floors, int rooms, int rate) {
		
		this.floors = floors;
		this.rooms = rooms;
		this.rate = rate;
	}
     

}
