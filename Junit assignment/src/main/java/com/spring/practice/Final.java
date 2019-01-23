package com.spring.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Final {

public AttendenceDao dao;
	
	public  AttendenceDao getDao() {
		return dao;
	}
	
	public void setDao(AttendenceDao dao) {
		this.dao=dao;
	}

	public List<Rank> rankstudents(List<Rank> rank1) {
		//List<Rank> rank1=dao.getStudents();
		Collections.sort(rank1,new MySalaryComp());
		int n1=0;
		for(Rank r1:rank1)
		   {
			r1.setRANK(1);
		   }
		for(Rank r1:rank1)
		   {
			   
			   r1.setRANK(r1.getRANK()+n1);
			   
			   System.out.println(r1.getID()+" "+r1.getTOTAL()+" "+r1.getNAME()+" "+ r1.getDOB()+" " +r1.getRANK());
			   n1++;
		   }
		return rank1;
		
	}

	
}
