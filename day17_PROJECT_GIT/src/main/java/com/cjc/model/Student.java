package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student 
{
	@Id
  private int rollno;
  private String name;
  private String addr;

}
