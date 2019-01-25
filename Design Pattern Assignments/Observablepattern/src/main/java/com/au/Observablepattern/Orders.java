package com.au.Observablepattern;

public class Orders {
	 
	int orders,Bill;
    
    Currentorders currentorders; 
    Runningorders averageorders;  
    public Orders(Currentorders currentDisplay, 
                       Runningorders averageDisplay) 
    { 
        this.currentorders = currentDisplay; 
        this.averageorders = averageDisplay; 
    } 
 
    private int numberoforders() 
    { 
        
        return 100; 
    } 
   
    private int billpereachorder() 
    { 
        
        return 10; 
    } 
  
    
  
    
    public void dataChanged() 
    { 
        
        orders = numberoforders();
        Bill=billpereachorder();
        
  
        currentScoreDisplay.update(orders,Bill); 
        averageScoreDisplay.update(orders,Bill); 
    } 
} 
