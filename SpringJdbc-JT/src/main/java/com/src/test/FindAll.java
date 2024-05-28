package com.src.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.src.config.ConfigFile;
import com.src.controller.ArmyController;
import com.src.dto.Army;

public class FindAll {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigFile.class);
		ArmyController armyController = applicationContext.getBean(ArmyController.class);
		List<Army> army = armyController.findAll();
		for (Army army2 : army) {
			System.out.println(army2);
		}
	}
}
