package com.src.dao;

import java.util.List;

import com.src.dto.Student;

public interface StudentDao {
 public void save (Student student);
 public void update (Student student);
 public void deletebyid (Integer id);
 public Student findbyid (String loc);
 public List<Student> findall();
 
}
