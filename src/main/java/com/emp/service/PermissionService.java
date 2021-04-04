package com.emp.service;

import java.sql.SQLException;
import java.util.List;

import com.emp.model.Permission;

public interface PermissionService {

	int insert(Permission permission) throws SQLException;

	int update(Permission permission) throws SQLException;

	int delete(Permission permission) throws SQLException;

	List select(Permission permission) throws SQLException;

}
