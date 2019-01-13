package com.accolite.au.pratice;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Employee {
	String employname;
	int id;
	int age;
	public Employee(String h,int a, int b)
	{
		this.employname=h;
		this.age=b;
		this.id=a;
	}
	public String getEmployname() {
		return employname;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String toString(){
        return "Name: "+this.employname+"-- Age: "+this.age;
    }
	

}
