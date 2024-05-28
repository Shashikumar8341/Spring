package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.ArmyController;

public class DeleteId {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
		ArmyController armyController = applicationContext.getBean(ArmyController.class);
		armyController.deleteById(1);
		System.out.println("su");
	}
}
