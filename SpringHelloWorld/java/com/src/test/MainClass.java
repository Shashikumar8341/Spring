package com.src.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.Address;

public class MainClass {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeansetter.xml");	
		Address a=applicationContext.getBean(Address.class);
		a.display();
		}
}
