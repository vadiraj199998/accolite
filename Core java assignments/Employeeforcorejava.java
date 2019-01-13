package com.accolite.au.pratice;

public class Employeeforcorejava {
	String ename;
	int eid;
	int age;
	String comname;
	Addressforcorejava Addr;
	
	public Employeeforcorejava(String ename2, int eid2, int age2, String comname2, 
			String m, String n, String o,String p) {
		this.ename = ename2;
		this.eid = eid2;
		this.age = age2;
		this.comname = comname2;
		this.Addr=new Addressforcorejava();
		this.Addr.state=m;
		this.Addr.town=n;
		this.Addr.Lnadmark=o;
		this.Addr.pincode=p;
	}
	
	
	
}
class Softdev extends Employeeforcorejava{
	String designation;
	int salaray;
	int hike;
	public Softdev(String ename3, int eid3, int age3, String comname3, String f, String g, String h, String j,
			String designation, int salaray, int hike) {
		super(ename3, eid3, age3, comname3, f, g, h, j);
		this.designation = designation;
		this.salaray = salaray;
		this.hike = hike;
	}
}
class Softwaremanager extends Employeeforcorejava{
		String designation;
		int salaray;
		int hike;
		public Softwaremanager(String ename2, int eid2, int age2, String comname2, String m, String n, String o,
				String p, String designation, int salaray, int hike) {
			super(ename2, eid2, age2, comname2, m, n, o, p);
			this.designation = designation;
			this.salaray = salaray;
			this.hike = hike;
		}
		
}


	
	


