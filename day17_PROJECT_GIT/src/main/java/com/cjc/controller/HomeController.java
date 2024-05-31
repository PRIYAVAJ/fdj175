package com.cjc.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.serviceI.StudentServiceI;


@RestController
public class HomeController 
{

	
	@Autowired
	StudentServiceI ssi;
	
	
	@PostMapping("/addStu")
	public String addStudent(@RequestBody Student s)
	{
		ssi.saveStudent(s);
		return "added successfully";
	}
	@DeleteMapping("/deletedata/{rollno}")
	public String deletdata(@RequestBody Student s)
	{
		ssi.save(s);
		
		return "data deleted";
		
		
		
	}
	@GetMapping("/getData")
	public List<Student> Studentget(){
		List<Student> list= ssi.Student();
		
		return list;
		
	}
	
	@PutMapping("/updateData")
	public String UpdateData(@RequestBody Student  stu) {
		ssi.updatData(stu);
		return"update Success.........!:)";
	}
	
	
	
	
	

		
	}


