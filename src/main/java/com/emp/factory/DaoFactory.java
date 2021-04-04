package com.emp.factory;

import com.emp.dao.EmpDao;
import com.emp.dao.EmpDaoImpl;
import com.emp.dao.PermissionDao;
import com.emp.dao.PermissionDaoImpl;
import com.emp.dao.RoleDao;
import com.emp.dao.RoleDaoImpl;


public class DaoFactory {
	
	private void DaoFactroy() {

	}

	private static EmpDao empDao = null;
	private static RoleDao roleDao = null;
	private static PermissionDao permissionDao = null;

	public static EmpDao getEmpDao() {
		if (empDao == null) {
			empDao = new EmpDaoImpl();
		}
		return empDao;
	}

	public static RoleDao getRoleDao() {
		if (roleDao == null) {
			roleDao = new RoleDaoImpl();
		}
		return roleDao;
	}
	public static PermissionDao getPermissionDao() {
		if (permissionDao == null) {
			permissionDao = new PermissionDaoImpl();
		}
		return permissionDao;
	}

}
