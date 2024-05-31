package com.cjc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@PostMapping("/addStu")
	public String addStudent()
	{
		return "added successfully";
	}

}
