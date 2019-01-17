package com.Accolite.soap;

public class Emp {
	int id;
	String nameofemp;
	String  address;
	
	public Emp(int a,String l,String m)
	{
		this.id=a;
		this.nameofemp=l;
		this.address=m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameofemp() {
		return nameofemp;
	}

	public void setNameofemp(String nameofemp) {
		this.nameofemp = nameofemp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
