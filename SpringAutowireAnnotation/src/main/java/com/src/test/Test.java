package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.controller.AddressController;
import com.src.dto.Address;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
		AddressController ac = (AddressController) applicationContext.getBean("AddressController");
		ac.save(new Address(01, "shashi"));
	}
}
