package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dto.MetroGreenLine;

public class MetroGreenTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
		MetroGreenLine metro = applicationContext.getBean(MetroGreenLine.class);
		metro.dispaly();
	}
}
