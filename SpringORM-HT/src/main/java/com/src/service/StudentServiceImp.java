package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.StudentDao;
import com.src.dto.Student;
@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

	@Override
	public void deletebyid(Integer id) {
		studentDao.deletebyid(id);
	}

	@Override
	public Student findbyid(String loc) {
		return studentDao.findbyid(loc);
	}

	@Override
	public List<Student> findall() {
		return studentDao.findall();
	}
}
