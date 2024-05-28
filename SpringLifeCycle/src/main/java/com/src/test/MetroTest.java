package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dto.MetroBlueLine;

public class MetroTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		MetroBlueLine metro = applicationContext.getBean(MetroBlueLine.class);
		metro.dispaly();
	}
}
