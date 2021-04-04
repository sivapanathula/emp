package com.emp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.emp.dao.EmpDao;
import com.emp.dao.EmpDaoImpl;
import com.emp.factory.DaoFactory;
import com.emp.model.Employee;
import com.emp.utilities.ConnectionUtility;

public class EmpServiceImpl implements EmpService {

	Connection conn = null;

	public int insert(Employee employee) throws SQLException {
		
		/*
		 * Class.forName("org.sqlite.JDBC"); String dbURL =
		 * "jdbc:sqlite:C://sqlite3/emp.db"; Connection conn =
		 * DriverManager.getConnection(dbURL); EmpDaoImpl dao=new EmpDaoImpl()
		 */;

		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			EmpDao dao = DaoFactory.getEmpDao();
			int result = dao.insert(conn, employee);
			conn.commit();
			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}

		return 0;
	}

	public void select(Employee employee) throws SQLException {

		try {
			/*
			 * Class.forName("org.sqlite.JDBC"); String dbURL =
			 * "jdbc:sqlite:C://sqlite3/emp.db"; Connection conn =
			 * DriverManager.getConnection(dbURL); EmpDaoImpl dao=new EmpDaoImpl()
			 */;
			Connection conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);
			EmpDao dao = DaoFactory.getEmpDao();
			dao.select(conn, employee);
conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
		conn.close();	
		}

	}

	@Override
	public int update(Employee employee) throws SQLException {
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			EmpDao dao = DaoFactory.getEmpDao();
			int result = dao.update(conn, employee);
			conn.commit();
			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return 0;
	}

	@Override
	public int delete(Employee employee) throws SQLException {
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			EmpDao dao = DaoFactory.getEmpDao();
			int result = dao.delete(conn, employee);
			conn.commit();
			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return 0;
	}

}
