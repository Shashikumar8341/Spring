package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.ArmyController;
import com.src.dto.Army;

public class Save {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
//		ArmyController armyController = applicationContext.getBean(ArmyController.class);
		ArmyController armyController = (ArmyController)applicationContext.getBean("armyController");
		armyController.save(new Army(01, "shashi", 35665.00));
	}
}
