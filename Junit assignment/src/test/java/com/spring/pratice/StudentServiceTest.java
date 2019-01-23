package com.spring.pratice;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.spring.practice.AttendenceDao;
import com.spring.practice.Final;
import com.spring.practice.Rank;


public class StudentServiceTest {
	public AttendenceDao StudentDaoMock;
	public Final service;
	@Before
	public void setup() {
		service=new Final();
		StudentDaoMock=Mockito.mock(AttendenceDao.class);
		service.setDao(StudentDaoMock);
	}
	@Test
	  public void Testforname()
	  {
		List<Rank> students =new ArrayList<Rank>();
		  students.add(new Rank());
		  students.get(0).setDOB("02-04-1998");
		  students.get(0).setID(0);
		  students.get(0).setNAME("vadiraj");
		  students.get(0).setTOTAL(198);
		  
		  students.add(new Rank());
		  students.get(1).setDOB("06-04-1998");
		  students.get(1).setID(1);
		  students.get(1).setNAME("vadi");
		  students.get(1).setTOTAL(200);
		
		  students.add(new Rank());
		  students.get(2).setDOB("07-04-1998");
		  students.get(2).setID(1);
		  students.get(2).setNAME("anshu");
		  students.get(2).setTOTAL(200);
		 
		  Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		  List<Rank> toppers=service.rankstudents(students);
		 
		  assertEquals("anshu",toppers.get(1).getNAME());
		  
		  
	  }
	@Test
	  public void Testforrank()
	  {
		List<Rank> students =new ArrayList<Rank>();
		  students.add(new Rank());
		  students.get(0).setDOB("02-04-1998");
		  students.get(0).setID(0);
		  students.get(0).setNAME("vadiraj");
		  students.get(0).setTOTAL(198);
		  
		  students.add(new Rank());
		  students.get(1).setDOB("06-04-1998");
		  students.get(1).setID(1);
		  students.get(1).setNAME("vadi");
		  students.get(1).setTOTAL(200);
		 
		  students.add(new Rank());
		  students.get(2).setDOB("07-04-1998");
		  students.get(2).setID(1);
		  students.get(2).setNAME("anshu");
		  students.get(2).setTOTAL(200);
		 
		  Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		  List<Rank> toppers=service.rankstudents(students);
		  assertEquals(1,toppers.get(0).getRANK());
		  assertEquals(2,toppers.get(1).getRANK());
		  assertEquals(3,toppers.get(2).getRANK());
		   
	  }
	@Test
	  public void Testfordob()
	  {
		List<Rank> students =new ArrayList<Rank>();
		  students.add(new Rank());
		  students.get(0).setDOB("02-04-1998");
		  students.get(0).setID(0);
		  students.get(0).setNAME("vadiraj");
		  students.get(0).setTOTAL(198);
		  
		  students.add(new Rank());
		  students.get(1).setDOB("06-04-1998");
		  students.get(1).setID(1);
		  students.get(1).setNAME("vadi");
		  students.get(1).setTOTAL(200);
		 
		  students.add(new Rank());
		  students.get(2).setDOB("07-04-1998");
		  students.get(2).setID(1);
		  students.get(2).setNAME("anshu");
		  students.get(2).setTOTAL(200);
		 
		  Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		  List<Rank> toppers=service.rankstudents(students);
		  assertEquals("06-04-1998",toppers.get(0).getDOB());
		  assertEquals("07-04-1998",toppers.get(1).getDOB());
		  assertEquals("02-04-1998",toppers.get(2).getDOB());
		   
	  }
	@Test
	  public void Testforid()
	  {
		List<Rank> students =new ArrayList<Rank>();
		  students.add(new Rank());
		  students.get(0).setDOB("02-04-1998");
		  students.get(0).setID(0);
		  students.get(0).setNAME("vadiraj");
		  students.get(0).setTOTAL(198);
		  
		  students.add(new Rank());
		  students.get(1).setDOB("06-04-1998");
		  students.get(1).setID(1);
		  students.get(1).setNAME("vadi");
		  students.get(1).setTOTAL(200);
		 
		  students.add(new Rank());
		  students.get(2).setDOB("07-04-1998");
		  students.get(2).setID(2);
		  students.get(2).setNAME("anshu");
		  students.get(2).setTOTAL(200);
		 
		  Mockito.when(StudentDaoMock.getStudents()).thenReturn(students);
		  List<Rank> toppers=service.rankstudents(students);
		  assertEquals(1,toppers.get(0).getID());
		  assertEquals(2,toppers.get(1).getID());
		  assertEquals(0,toppers.get(2).getID());
		 
		   
	  }
	@After
	 public void teradown()
	 {
		 service=null;
	 }
}
