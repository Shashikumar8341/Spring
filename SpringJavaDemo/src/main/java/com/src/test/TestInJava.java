package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.JavaConfigFile;
import com.src.service.LopiService;

public class TestInJava {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		LopiService ls = applicationContext.getBean(LopiService.class);
		ls.getLopiService();
	}
}
