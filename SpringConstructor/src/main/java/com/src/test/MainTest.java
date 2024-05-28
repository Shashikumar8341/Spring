package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.Address;

public class MainTest {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//	Address a=applicationContext.getBean(Address.class, args);
//	Address a=(Address)applicationContext.getBean("address");
	Address a=applicationContext.getBean(Address.class);
	a.display();
}
}
