package com.src.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.src.dto.Army;
import com.src.rowmapper.ArmyRowmapper;
@Repository
public class ArmyDaoImp implements ArmyDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Army army) {
		jdbcTemplate.update("INSERT INTO SHASHI VALUES(?,?,?)",
				new Object[] { army.getId(), army.getSoldier(), army.getSalar() });

	}

	@Override
	public void update(Army army) {

		jdbcTemplate.update("UPDATE SHASHI SET soldier = ? , salar = ? WHERE ID = ?",
				new Object[] { army.getId(), army.getSoldier(), army.getSalar() });

	}

	@Override
	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM SHASHI WHERE ID = ?", new Object[] { eid });

	}

	@Override
	public Army findById(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM SHASHI WHERE ID = ?", new Object[] { eid },
				new ArmyRowmapper());
	}

	@Override
	public List<Army> findAll() {
		return jdbcTemplate.query("SELECT * FROM SHASHI", new ArmyRowmapper());
	}

}
