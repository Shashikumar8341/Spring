package com.src.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.ArmyController;
import com.src.dto.Army;

public class Update {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
		ArmyController armyController = applicationContext.getBean(ArmyController.class);
		armyController.update(new Army(01,"shiva",35356.00));
		System.out.println("su");
	}
}
