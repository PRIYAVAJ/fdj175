package com.cjc.controller;
@RestController
public class HomeController 
{
	@PostMapping("/addStu")
	public String addStudent()
	{
		return "added successfully";
	}

}
