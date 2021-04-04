package com.emp.dao;

import java.sql.Connection;
import java.util.List;

import com.emp.model.Permission;

public interface PermissionDao {

	int insert(Connection conn, Permission permission);

	int update(Connection conn, Permission permission);

	int delete(Connection conn, Permission permission);

	List select(Connection conn, Permission permission);

}
