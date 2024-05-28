package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.src.dto.Student;
import com.src.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	public void save(Student student) {
		studentService.save(student);
	}

	public void update(Student student) {
		studentService.update(student);
	}

	public void deletebyid(Integer id) {
		studentService.deletebyid(id);
	}

	public Student findbyid(String loc) {
		return studentService.findbyid(loc);
	}

	public List<Student> findall() {
		return studentService.findall();
	}
}
