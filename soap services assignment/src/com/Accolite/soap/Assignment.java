package com.Accolite.soap;
import java.util.*;
public class Assignment {
	static ArrayList<Emp> emp=new ArrayList<Emp>();
	String h;
	String v;
	public String  addemploy(int k,String l,String j)
	{
		
		emp.add(new Emp(k,l,j));
		return "Added";
	}
	public  String showemployee(int k)
	{
		for(Emp e1:emp)
		{
			if(e1.getId()==k)
			{
				v=e1.getAddress();
				h=e1.getNameofemp();
				return "Name:"+h+"Address"+v;
				
			}
				
			
		}
		return "NOT FOUND";
		
		
		
	}
	public String updateemployee(int k,String l,String m)
	{
		for(Emp e1:emp)
		{
			if(e1.getId()==k)
			{
				e1.setNameofemp(l);
				e1.setAddress(m);
				return "Found and updated";
				
			}
				
			
		}
		return "NOT FOUND";
		
	}
	public String Deleteemp(int k)
	{
		for(Emp e1:emp)
		{
			if(e1.getId()==k)
			{
				emp.remove(e1);
				return "Found and deleted";
				
			}
				
			
		}
		return "NOT FOUND";
	}
	public  String getAllEmp() {
		String s="";
		for(Emp e:emp)
		{
			s += "name :"+e.getNameofemp()+" id :"+e.getId()+" address"+e.getAddress(); 
		}	
		return s;
	}

}
