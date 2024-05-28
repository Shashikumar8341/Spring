package com.src.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MetroRedTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
		MetroRedTest metro = (MetroRedTest)applicationContext.getBean(MetroRedTest.class);
		metro.toString();
	}
}