package com.au.AbstractFactory;

import com.au.Model.Building;

public class Buildingfactory {
	public static Building getbuilding(Buildingabstractfactory factory){
		return factory.createbuilding();
	}

}
