package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.AddressController;
import com.src.dto.Address;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
		AddressController ac = applicationContext.getBean(AddressController.class);
		ac.save(new Address(01, "shashi"));
	}
}
