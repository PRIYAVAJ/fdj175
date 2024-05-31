package com.cjc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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


