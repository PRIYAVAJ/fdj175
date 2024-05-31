package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.serviceI.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired StudentRepository sri;

	@Override
	public void saveStudent(Student s) 
	{
		sri.save(s);
		
	}

}
