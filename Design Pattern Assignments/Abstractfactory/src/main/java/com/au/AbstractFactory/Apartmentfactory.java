package com.au.AbstractFactory;

import com.au.Model.Apartment;
import com.au.Model.Building;

public class Apartmentfactory implements Buildingabstractfactory {
	private int floors;
    private int rooms;
    private int rate;
	public Apartmentfactory(int floors, int rooms, int rate) {
		super();
		this.floors = floors;
		this.rooms = rooms;
		this.rate = rate;
	}
	public Building createbuilding() {
		return new Apartment(floors,rooms,rate);
	}

}
