package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.ArmyDaoImp;
import com.src.dto.Army;

@Service
public class ArmyServiceImp implements ArmyService {
	@Autowired
	private ArmyDaoImp armyDaoImp;

	@Override
	public void save(Army army) {
		System.out.println("save the di");
		armyDaoImp.save(army);
	}

	@Override
	public void update(Army army) {
		armyDaoImp.update(army);
	}

	@Override
	public void deleteById(Integer id) {
		armyDaoImp.deleteById(id);
	}

	@Override
	public Army findById(Integer id) {
		return armyDaoImp.findById(id);
	}

	@Override
	public List<Army> findAll() {
		return armyDaoImp.findAll();
	}

}
