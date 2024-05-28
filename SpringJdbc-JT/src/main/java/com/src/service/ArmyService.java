package com.src.service;

import java.util.List;

import com.src.dto.Army;

public interface ArmyService {
	public void save(Army army);

	public void update(Army army);

	public void deleteById(Integer eid);

	public Army findById(Integer eid);

	public List<Army> findAll();

}
