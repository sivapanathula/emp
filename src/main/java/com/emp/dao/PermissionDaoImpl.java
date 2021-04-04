package com.emp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.base.BaseDao;
import com.emp.model.Permission;
import com.emp.model.Role;

public class PermissionDaoImpl extends BaseDao implements PermissionDao {

	private String sql;

	@Override
	public int insert(Connection conn, Permission permission) {

		List data = new ArrayList<>();
		data.add(permission.getPermissionId());
		data.add(permission.getPermissionName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public int update(Connection conn, Permission permission) {
		List data = new ArrayList<>();
		data.add(permission.getPermissionId());
		data.add(permission.getPermissionName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public int delete(Connection conn, Permission permission) {
		List data = new ArrayList<>();
		data.add(permission.getPermissionId());
		data.add(permission.getPermissionName());
		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public List select(Connection conn, Permission permission) {
		List data = new ArrayList<>();
		List result = (List) execute(conn, sql, data);
		return result;

	}

	@Override
	public List<Object> processResultSet(ResultSet resultSet) throws SQLException {

		List list = new ArrayList<>();
		while (resultSet.next()) {
			Permission permission = new Permission();
			permission.setPermissionId(resultSet.getInt(1));
			permission.setPermissionName(resultSet.getString(2));

			list.add(permission);

		}
		return list;
	}

}
