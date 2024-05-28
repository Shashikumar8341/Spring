package com.src.dao;

import java.util.List;

import com.src.dto.Army;

public interface ArmyDao {
	public void save(Army army);

	public void update(Army army);

	public void deleteById(Integer eid);

	public Army findById(Integer eid);

	public List<Army> findAll();

}
