package com.emp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.emp.dao.PermissionDao;
import com.emp.dao.RoleDao;
import com.emp.factory.DaoFactory;
import com.emp.model.Permission;
import com.emp.utilities.ConnectionUtility;

public class PermissionServiceImpl implements PermissionService {
	Connection conn = null;
	@Override
	public int insert(Permission permission) throws SQLException {

		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			PermissionDao dao = DaoFactory.getPermissionDao();
			int result = dao.insert(conn, permission);
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
	public int update(Permission permission) throws SQLException {
		
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			PermissionDao dao = DaoFactory.getPermissionDao();
			int result = dao.update(conn, permission);
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
	public int delete(Permission permission) throws SQLException {
		
		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			PermissionDao dao = DaoFactory.getPermissionDao();
			int result = dao.delete(conn, permission);
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
	public List select(Permission permission) throws SQLException {

		try {
			 conn = ConnectionUtility.createConnection();
			conn.setAutoCommit(false);

			PermissionDao dao = DaoFactory.getPermissionDao();
			List result = dao.select(conn, permission);
			conn.commit();
			
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}

		return null;
	}

}
