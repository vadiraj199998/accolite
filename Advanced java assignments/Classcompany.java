package com.accolite.au.pratice;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Classcompany {
	public static void main(String[] args) {
		String cit;
		int p;
		System.out.println("Enter the number of companies");
		Scanner inc = new Scanner(System.in);
		Scanner ini = new Scanner(System.in);
		p=ini.nextInt();
		
			Company c[]=new Company[p];
			
			for(int i=0;i<p;i++)
			{
				c[i]=new Company();
			}
			for (int i=0;i<p;i++)
			{
				String s;
				String o;
				int a;
				String h;
				int y;
				int z;
				Scanner in = new Scanner(System.in);
				Scanner ino = new Scanner(System.in);
				System.out.println("input company name");
				
				c[i].setCompanyname(in.nextLine());
				System.out.println("input company street");
				s = in.nextLine();
				System.out.println("input company City");
				o = in.nextLine();
				
				c[i].setA(s, o);
				System.out.println(c[i].companyname);
				System.out.println(c[i].A.city);
				System.out.println(c[i].A.street);
				
				c[i].E=new LinkedList<>();
				System.out.println("Mention the number of employess");
				a=ino.nextInt();
				for(int j=0;j<a;j++)
				{
					System.out.println("Employee name");
					h = in.nextLine();
					System.out.println("Employee id");
					y=ino.nextInt();
					System.out.println("Employee Age");
					z=ino.nextInt();
				    c[i].E.add(new Employee(h,y,z));
				}
			}
			
		for(int k=0;k<p;k++) {
	         System.out.println(" ");
	         System.out.println("Employees Sorted Based on Age");
			Collections.sort(c[k].E,new MySalaryComp());
			for(Employee e:c[k].E){
	            System.out.println(e.toString());
			}
			 System.out.println(" ");
	         System.out.println("Employees Sorted Based on Names");
	         Collections.sort(c[k].E, new Sortbyname());
	         for(Employee w:c[k].E){
		            System.out.println(w.toString());
	         }
	         System.out.println(" ");
	         System.out.println(" Employees whose age is less than 30");
		            for(Employee b:c[k].E){
		            	if (b.age < 30)
		            	{
		            	
			            System.out.println(b.toString());
		            	}
		            }
		}
		System.out.println("Mention the city u want to search companies ");
		cit = inc.nextLine();
		System.out.println("companies in same city");
		
		for(int s=0;s<p;s++)
		{
			if(c[s].A.city.equals(cit))
			{
				System.out.println("Company Name:");
				System.out.println(c[s].companyname);
				System.out.println("Comapny city:");
				System.out.println(c[s].A.city);
				System.out.println("Comapny street:");
				System.out.println(c[s].A.street);
				System.out.println(" ");
			}
				
		}
			
			}
		}
					
