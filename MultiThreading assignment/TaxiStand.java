package com.au.Multi;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
public class TaxiStand {
    private int size = 5;
    private LinkedList<Taxi> taxiStand;
    @SuppressWarnings("unused")
	private LinkedList<Taxi> taxiQueue;
    private LinkedList<Passenger> passengerQueue;

    public TaxiStand(int capacity, LinkedList<Taxi> q, LinkedList<Passenger> pq) {
        size = capacity;
        taxiQueue = q;
        passengerQueue = pq; 
        taxiStand = new LinkedList<Taxi>();
        for(int i=0; i<size ; i++){
            taxiStand.add(new Taxi());
        }
        System.out.println("Creating a TaxiStand with capacity " + size);
    }

    public boolean addTaxi(Taxi c){
       if(!isFull() || isEmpty())
       {
    	   
    	   taxiStand.add(c);
    	   return true;
       }
       return false;
    }

    public boolean isFull(){
        return (taxiStand.size()<size) ? false : true;
    }
    
    public boolean isEmpty() {
        return (taxiStand.size()==0) ? true : false;
    }

    public boolean allocatePassenger(Passenger p) {
    	boolean u=false ;
    	for(Taxi q:taxiStand)
    	{
    	if(q.getDestination()==null)
    		{
    			q.setDestination(p.getDestination());
    			 u=q.addPassenger();
    		}
    	
    	
    	else if(q.getDestination()==p.getDestination()){
    	               System.out.println("Found taxi to " + p.getDestination());
    	               u= q.addPassenger();
    	    			}
    	             
    	
    	}
    	return u;
    	}
    			
    	
    	
  

    public void processPassengerQueue(){
        System.out.println("Starting to process passengerQueue with " + passengerQueue.size() + " passengers");
        for(Passenger i:passengerQueue)
        {
        	if(this.allocatePassenger(i));
        	{
        	passengerQueue.remove(i);
        	System.out.println("One of them in queue is procseesed");
        	}
        }
        
       
        System.out.println("After processing passengerQueue " + passengerQueue.size() + " passengers remain in queue");
        
    }
    public synchronized void processTaxiStandQueue() {

		ListIterator<Taxi> standIterator = taxiStand.listIterator();

		while (standIterator.hasNext()) {

			Taxi taxi = standIterator.next();

			 long finish = System.currentTimeMillis();

			 long timeElapsed = finish - taxi.time;

			if (taxi.getpassengerCount() == 4 || (!(taxi.isEmpty())&&((timeElapsed)>50000))) {

				System.out.println("Taxi to " + taxi.getDestination() + " departs");

				taxiStand.remove(taxi);

			}

		}

	}

    public void printStatus() {
        ListIterator<Taxi> standIterator = taxiStand.listIterator();
        int position=0;
        while(standIterator.hasNext()) {
            Taxi taxi = standIterator.next();
            position++;
            System.out.println(position + ". Taxi to " + taxi.getDestination() + " passengers=" + taxi.getpassengerCount());
        }
    }
    public static void main(String[] args) {
        System.out.println("Starting simulaion...");
        LinkedList<Taxi> taxiQueue = new LinkedList<Taxi>();
        LinkedList<Passenger> passengerQueue = new LinkedList<Passenger>();
        TaxiStand lot = new TaxiStand(5, taxiQueue, passengerQueue);
       
        TaxiQueueRunnable taxicreator = new TaxiQueueRunnable(taxiQueue, lot);
        PassengerQueueRunnable passengerCreator = new PassengerQueueRunnable(passengerQueue, lot);
        Thread T2=new Thread(taxicreator);
        Thread T1=new Thread(passengerCreator);
        //t1.setPriority(4);
        //t2.setPriority(5);
      
        	T1.start();
        	synchronized(T1){
                try{
                    System.out.println("Waiting for queue procesiing...");
                    T1.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        	lot.processPassengerQueue();
        	lot.processTaxiStandQueue();
        	T2.start();
        	T2.notifyAll();
        	lot.printStatus();
        	
		
        
       
  
    }
}
}

