package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.base.BaseDao;
import com.emp.model.Employee;

public class EmpDaoImpl extends BaseDao implements EmpDao {

	public int insert(Connection conn, Employee employee) {

		String sql = "INSERT INTO Employee (id, firstName, lastName, emailId, password) VALUES (?, ?, ?, ?, ?)";
		/*
		 * try { PreparedStatement statement=conn.prepareStatement(sql);
		 * statement.setInt(1, employee.getId()); statement.setString(2,
		 * employee.getFirstName()); statement.setString(3, employee.getLastName());
		 * statement.setString(4, employee.getEmailId()); statement.setString(5,
		 * employee.getPassword()); int result=statement.executeUpdate(); } catch
		 * (SQLException e) { e.printStackTrace(); } return 0;
		 */
		List data = new ArrayList<>();
		data.add(employee.getId());
		data.add(employee.getFirstName());
		data.add(employee.getLastName());
		data.add(employee.getEmailId());
		data.add(employee.getPassword());

		int result = (int) execute(conn, sql, data);
		return result;

	}

	public List select(Connection conn, Employee employee) {
		String sql = "SELECT * FROM EMPLOYEE";
		/*
		 * try { PreparedStatement statement = conn.prepareStatement(sql);
		 * 
		 * ResultSet rs = statement.executeQuery(); while (rs.next()) { int id =
		 * rs.getInt(1); String firstName = rs.getString(2); String lastName =
		 * rs.getString(3); String emailId = rs.getString(4); String password =
		 * rs.getString(5);
		 * 
		 * System.out.println(id + "," + firstName + "," + lastName + "," + emailId +
		 * "," + password); } } catch (SQLException e) { e.printStackTrace(); }
		 */

		List data = new ArrayList<>();
		List result = (List) execute(conn, sql, data);
		return result;

	}

	@Override
	public List<Object> processResultSet(ResultSet resultSet) throws SQLException {

		List list = new ArrayList<>();
		while (resultSet.next()) {
			Employee employee = new Employee();
			employee.setId(resultSet.getInt(1));
			employee.setFirstName(resultSet.getString(2));
			employee.setLastName(resultSet.getString(3));
			employee.setEmailId(resultSet.getString(4));
			employee.setPassword(resultSet.getString(5));
			list.add(employee);

		}
		return list;
	}

	@Override
	public int update(Connection conn, Employee employee) {
		String sql = "INSERT INTO Employee (id, firstName, lastName, emailId, password) VALUES (?, ?, ?, ?, ?)";
		List data = new ArrayList<>();
		//data.add(employee.getId());
		data.add(employee.getFirstName());
		data.add(employee.getLastName());
		data.add(employee.getEmailId());
		data.add(employee.getPassword());

		int result = (int) execute(conn, sql, data);
		return result;
	}

	@Override
	public int delete(Connection conn, Employee employee) {
		String sql = "INSERT INTO Employee (id, firstName, lastName, emailId, password) VALUES (?, ?, ?, ?, ?)";
		List data = new ArrayList<>();
		data.add(employee.getId());
		int result = (int) execute(conn, sql, data);
		return result;
	}

}
