package com.emp.dao;

import java.sql.Connection;
import java.util.List;

import com.emp.model.Employee;

public interface EmpDao {

	int insert(Connection conn, Employee employee);

	List select(Connection conn, Employee employee);

	int update(Connection conn, Employee employee);

	int delete(Connection conn, Employee employee);

}
