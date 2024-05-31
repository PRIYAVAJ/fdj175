package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.serviceI.StudentServiceI;

@RestController
public class HomeController 
{
	@Autowired StudentServiceI ssi;
	
	
	@PostMapping("/addStu")
	public String addStudent(@RequestBody Student s)
	{
		ssi.saveStudent(s);
		return "added successfully";
	}

}
