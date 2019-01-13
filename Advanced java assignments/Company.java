package com.accolite.au.pratice;

import java.util.List;

public class Company {
	String companyname;
	List<Employee> E;
	Address A;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	public void setA(String s,String c) {
		this.A=new Address();
		this.A.street = s;
		this.A.city=c;
	}
	
	

}
