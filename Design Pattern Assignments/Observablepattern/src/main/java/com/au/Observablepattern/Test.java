package com.au.Observablepattern;

public class Test {
	public static void main(String args[]) 
    { 
        
        Runningorders averageScoreDisplay = new Runningorders(); 
        Currentorders currentScoreDisplay = new Currentorders(); 
        Orders orders = new Orders(currentScoreDisplay,averageScoreDisplay); 
        orders.dataChanged(); 
    } 

}
