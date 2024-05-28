package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.controller.AddressController;
import com.src.dto.Address;

public class TestClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springleyar.xml");

		AddressController addressController = applicationContext.getBean(AddressController.class);
		addressController.save(new Address(01, "shashi"));

	}
}
