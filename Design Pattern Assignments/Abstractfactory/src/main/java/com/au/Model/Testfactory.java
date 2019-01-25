package com.au.Model;

import com.au.AbstractFactory.Apartmentfactory;
import com.au.AbstractFactory.Officefactory;

public class Testfactory {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	private static void testAbstractFactory() {
		Building apart = com.au.AbstractFactory.Buildingfactory.getbuilding(new Apartmentfactory(10,200,10));
		Building office = com.au.AbstractFactory.Buildingfactory.getbuilding(new Officefactory(10,200,10));
		System.out.println("AbstractFactory apartment Config::"+apart.toString());
		System.out.println("AbstractFactory office Config::"+office.toString());
}
}
