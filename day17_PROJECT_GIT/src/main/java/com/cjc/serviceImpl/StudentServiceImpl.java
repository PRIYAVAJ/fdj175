package com.cjc.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.serviceI.StudentServiceI;


@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentRepository sri;

	@Override
	public void saveStudent(Student s) 
	{
		sri.save(s);

		
	}

	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<com.cjc.model.Student> Student() {
		
		return sri.findAll();
	}

	@Override
	public void updatData(com.cjc.model.Student stu) {
		sri.save(stu);
		
	}

}
