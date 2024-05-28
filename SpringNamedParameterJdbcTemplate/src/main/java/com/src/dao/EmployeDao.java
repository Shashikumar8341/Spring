package com.src.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.src.dto.Employee;

public class EmployeDao {
	private NamedParameterJdbcTemplate template;

	public EmployeDao(NamedParameterJdbcTemplate template) {

		this.template = template;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void save(Employee employee) {
		String query = "insert into student values(:id,:name,:loc)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", employee.getId());
		map.put("name", employee.getName());
		map.put("loc", employee.getLoc());
		template.execute(query, map, new PreparedStatementCallback() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}
}
