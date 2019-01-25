package com.au.Observablepattern;

public class Currentorders {
	private int runs, wickets; 
     
  
    public void update(int runs,int wickets) 
    { 
        this.runs = runs; 
        this.wickets = wickets; 
        System.out.println("Currentbill"+"\n"+(runs*wickets)); 
    } 
  
    

}
