package com.src.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.src.dao.EmployeDao;
import com.src.dto.Employee;

@SuppressWarnings("deprecation")
public class SaveTest {
	public static void main(String[] args) {
	Resource r=new ClassPathResource("spring.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	EmployeDao dao=factory.getBean(EmployeDao.class);
	dao.save(new Employee(12, "sonoo", "khammam"));
	System.out.println("fix");
	}
}
