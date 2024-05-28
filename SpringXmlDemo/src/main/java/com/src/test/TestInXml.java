package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.service.LopiService;
import com.src.service.LopiServiceImp;

public class TestInXml {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		LopiServiceImp ls = applicationContext.getBean(LopiServiceImp.class);
		ls.getLopiService();
	}
}
