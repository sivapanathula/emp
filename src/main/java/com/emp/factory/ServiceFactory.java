package com.emp.factory;

import com.emp.service.EmpService;
import com.emp.service.EmpServiceImpl;
import com.emp.service.PermissionService;
import com.emp.service.PermissionServiceImpl;
import com.emp.service.RoleService;
import com.emp.service.RoleServiceImpl;

public class ServiceFactory {
	
	private void ServiceFactry() {

	}

	private static EmpService empService = null;
	private static RoleService roleService = null;
	private static PermissionService permissionService = null;

	public static EmpService getEmpService() {
		if (empService == null) {
			empService = new EmpServiceImpl();
		}
		return empService;
	}

	public static RoleService getRoleService() {
		if (roleService == null) {
			roleService = new RoleServiceImpl();
		}
		return roleService;
	}
	
	public static PermissionService getPermissionService() {
		if (permissionService == null) {
			permissionService = new PermissionServiceImpl();
		}
		return permissionService;
	}

}
