package com.spring.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Start : Using Spring:***********************");
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
		JDBCTemplateDAO jdbc=applicationContext.getBean(JDBCTemplateDAO.class);
	     
	  	 List<Student> list=jdbc.getAllEmployeesRowMapper();
	  	 List<Attendance> list1=jdbc.getAllEmployeesRowMapper1();
		
		List<Rank> rank= new ArrayList<Rank>();
		List<Rank> rank1= new ArrayList<Rank>();
	   Final n=new Final();
	   
	   for(Rank r:rank)
	   {
		   r.setTOTAL(0);
	   }
		System.out.println("list one size "+list1.size());
		Rank c[]=new Rank[list1.size()];
		 for(int i=0;i<list1.size();i++) 
		 { 
			 c[i]=new Rank();
		     c[i].setTOTAL(0);
		     c[i].setRANK(1);
		 }
		 
		for(Student e:list)
		{
			for(int i=1,j=0;i<=list1.size();i++,j++)
			{
				if(e.getStudentId()==i)
				{
					c[j].setTOTAL(c[j].getTOTAL()+e.getMarks());
					c[j].setID(e.getStudentId());
				}
				System.out.println("THIS iterates"+i);
			}
		}
		//int m=0;
		for(Attendance a:list1)
		{
			for(int i=1,j=0;i<=list1.size();i++,j++)
			{
				if(a.getSid()==i)
				{
			c[j].setNAME(a.getName());
			c[j].setDOB(a.getStatus());
				}
			}
			//m++;
		}
			for(int i=1,j=0;i<=list1.size();i++,j++)
			{
				rank.add(c[j]);
			}
			rank1=n.rankstudents(rank);
			for(Rank r:rank1)
			{
				jdbc.savefinal(r);
			}
			
			
			
	}

}