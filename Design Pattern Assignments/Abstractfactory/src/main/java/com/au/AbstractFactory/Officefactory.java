package com.au.AbstractFactory;


import com.au.Model.Building;
import com.au.Model.Office;

public class Officefactory implements Buildingabstractfactory {
	private int floors;
    private int rooms;
    private int rate;
	public Officefactory(int floors, int rooms, int rate) {
		super();
		this.floors = floors;
		this.rooms = rooms;
		this.rate = rate;
	}
	public Building createbuilding() {
		return new Office(floors,rooms,rate);
	}

}
