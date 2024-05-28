package com.src.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.src.dto.Student;

@Repository
@Transactional
public class StudentDaoImp implements StudentDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void save(Student student) {
		hibernateTemplate.save(student);
	}

	@Override
	public void update(Student student) {
		hibernateTemplate.update(student);		
	}

	@Override
	public void deletebyid(Integer id) {
		Student student=new Student();
		student.setId(id);
		hibernateTemplate.delete(student);	
	}

	@Override
	public Student findbyid(String loc) {
		return hibernateTemplate.get(Student.class,loc);
	}

	@Override
	public List<Student> findall() {
		return hibernateTemplate.loadAll(Student.class);
	}
 
}
