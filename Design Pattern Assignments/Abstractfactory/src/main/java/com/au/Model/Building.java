package com.au.Model;

public abstract class Building {
	public abstract int getFLOORS();
    public abstract int getROOMS();
    public abstract int getRATE();
    @Override
    public String toString(){
        return "Floors= "+this.getFLOORS()+", Rooms="+this.getROOMS()+", Ratings="+this.getRATE();
    }
     

}
