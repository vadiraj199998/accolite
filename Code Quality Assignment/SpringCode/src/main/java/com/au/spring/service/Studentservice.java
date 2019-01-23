package com.au.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.spring.model.Attendance;
import com.au.spring.dao.StudentDao;

@Service
public class Studentservice {
 @Autowired
 StudentDao studentDao;
 
 public String getName()
 {
	 return studentDao.getName();
 }
 
public void insert(Attendance attendence) {
	studentDao.insert(attendence);
	
}
public  List<Attendance> getAllEmployeesRowMapper()
{
	 return studentDao.getAllEmployeesRowMapper();
}
}
