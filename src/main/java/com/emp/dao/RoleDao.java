package com.emp.dao;

import java.sql.Connection;
import java.util.List;

import com.emp.model.Role;

public interface RoleDao {

	int insert(Connection conn, Role role);

	int update(Connection conn, Role role);

	int delete(Connection conn, Role role);

	List select(Connection conn, Role role);

}
