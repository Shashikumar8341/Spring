package com.src.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.src.dto.Army;

public  class ArmyRowmapper implements org.springframework.jdbc.core.RowMapper<Army> {

	@Override
	public Army mapRow(ResultSet rs, int rowNum) throws SQLException {
		Army army = new Army();
		army.setId(rs.getInt("id"));
		army.setSoldier(rs.getString("soldier"));
		army.setSalar(rs.getDouble("salar"));
		return army;
	

	}


}
