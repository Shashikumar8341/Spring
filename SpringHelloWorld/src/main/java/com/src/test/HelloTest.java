package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.demo.Hello;

public class HelloTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbean.xml");
		Hello hlo = applicationContext.getBean(Hello.class);
		hlo.helloWorld();
	}

}