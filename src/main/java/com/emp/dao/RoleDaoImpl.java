package com.emp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.base.BaseDao;
import com.emp.model.Role;

public class RoleDaoImpl extends BaseDao implements RoleDao {

	String sql = "";

	@Override
	public int insert(Connection conn, Role role) {

		List data = new ArrayList<>();
		data.add(role.getRoleId());
		data.add(role.getRoleName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public int update(Connection conn, Role role) {
		List data = new ArrayList<>();
		data.add(role.getRoleId());
		data.add(role.getRoleName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public int delete(Connection conn, Role role) {
		List data = new ArrayList<>();
		data.add(role.getRoleId());
		// data.add(role.getRoleName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public List select(Connection conn, Role role) {
		List data = new ArrayList<>();
		List result = (List) execute(conn, sql, data);
		return result;
	}

	@Override
	public List<Object> processResultSet(ResultSet resultSet) throws SQLException {

		List list = new ArrayList<>();
		while (resultSet.next()) {
			Role role = new Role();
			role.setRoleId(resultSet.getInt(1));
			role.setRoleName(resultSet.getString(2));

			list.add(role);

		}
		return list;
	}
}
