package com.emp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.emp.dao.EmpDao;
import com.emp.dao.RoleDao;
import com.emp.factory.DaoFactory;
import com.emp.model.Role;
import com.emp.utilities.ConnectionUtility;

public class RoleServiceImpl implements RoleService {
	Connection conn = null;
	@Override
	public int insert(Role role) throws SQLException {
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			RoleDao dao = DaoFactory.getRoleDao();
			int result = dao.insert(conn, role);
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
	public int update(Role role) throws SQLException {

		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			RoleDao dao = DaoFactory.getRoleDao();
			int result = dao.update(conn, role);
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
	public int delete(Role role) throws SQLException {

		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			RoleDao dao = DaoFactory.getRoleDao();
			int result = dao.delete(conn, role);
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
	public List select(Role role) throws SQLException {
		List result = null;
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			RoleDao dao = DaoFactory.getRoleDao();
			result = dao.select(conn, role);
			conn.commit();
			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return result;

		
	}

}
