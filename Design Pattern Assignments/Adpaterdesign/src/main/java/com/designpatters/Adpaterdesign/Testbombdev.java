package com.designpatters.Adpaterdesign;

public class Testbombdev {
public static void main(String[] args) {
		
		testClassAdapter();
}
		private static void testClassAdapter() {
			Bombdevp sockAdapter = new Bombdevpimpl();
			Energy v3 = getJoule(sockAdapter,3);
			Energy v12 = getJoule(sockAdapter,12);
			
			System.out.println("v3 volts using Class Adapter="+v3.getJoules());
			System.out.println("v12 volts using Class Adapter="+v12.getJoules());
			
		}
		private static Energy getJoule(Bombdevp sockAdapter, int i) {
			switch (i){
			case 3: return sockAdapter.getbombformining();
			case 12: return sockAdapter.getbombfordefence();
			default: return null;
			
			}
	}
}

