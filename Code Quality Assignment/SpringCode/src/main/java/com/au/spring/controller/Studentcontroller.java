package com.au.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.spring.model.Attendance;
import com.au.spring.service.Studentservice;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
	@Autowired
	Studentservice studentservice;
	
	@GetMapping("/getName")
	public String getName()
	{
		return studentservice.getName();
	}
	 @PostMapping("/insert/studentDetails")
	 public void insertstudentdetails(@RequestBody Attendance attendence)
	{
		studentservice.insert(attendence);
	}
	@GetMapping("/allstudents")
	public  List<Attendance> getAllEmployeesRowMapper()
	 {
		 return studentservice.getAllEmployeesRowMapper();
	 }
}
