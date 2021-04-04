package com.emp.service;

import java.sql.SQLException;

import com.emp.model.Employee;

public interface EmpService {

	int insert(Employee employee) throws SQLException;

	void select(Employee employee) throws SQLException;

	int update(Employee employee) throws SQLException;

	int delete(Employee employee) throws SQLException;

}
