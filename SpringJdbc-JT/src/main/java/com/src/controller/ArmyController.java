package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.src.dto.Army;
import com.src.service.ArmyServiceImp;
@Configuration
public class ArmyController {
	@Autowired
	private ArmyServiceImp armyServiceImp;

	public void save(Army army) {

		armyServiceImp.save(army);
	}

	public void update(Army army) {

		armyServiceImp.update(army);
	}

	public void deleteById(Integer id) {
		armyServiceImp.deleteById(id);
	}

	public Army findById(Integer id) {
		return armyServiceImp.findById(id);
	}

	public List<Army> findAll() {
		return armyServiceImp.findAll();
	}
}
