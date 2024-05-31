package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.serviceI.StudentServiceI;

public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	@Override
	public void save(Student s) {
		
	}

}
