package com.src.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.ArmyController;
import com.src.dto.Army;

public class FindById {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
		ArmyController armyController = applicationContext.getBean(ArmyController.class);
		Army army=armyController.findById(01);
		System.out.println(army);
	}
}
