package com.emp.service;

import java.sql.SQLException;
import java.util.List;

import com.emp.model.Role;

public interface RoleService {

	int insert(Role role) throws SQLException;

	int update(Role role) throws SQLException;

	int delete(Role role) throws SQLException;

	List select(Role role) throws SQLException;

}
