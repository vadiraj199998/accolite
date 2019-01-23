package com.spring.practice;

import java.util.List;

public interface AttendenceDao {
public List<Rank> getStudents();
	
	public Student saveStudent(Rank student) ;
	
	public void notifyStudent(Rank student);

}
