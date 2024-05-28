package com.src.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.StudentController;
import com.src.dto.Student;

public class SaveTest {

		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springHT.xml");
//			ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
			
			StudentController studentController =   applicationContext.getBean(StudentController.class);
			
//			studentController.save(new Student(10, "Praveen", "rdm"));
			studentController.save(new Student(11, "prem", "lgp"));
			
		}

	}
