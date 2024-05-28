package com.src.service;

import java.util.List;

import com.src.dto.Student;

public interface StudentService {
	 public void save (Student student);
	 public void update (Student student);
	 public void deletebyid (Integer id);
	 public Student findbyid (String loc);
	 public List<Student> findall();
}
