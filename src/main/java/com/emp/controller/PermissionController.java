package com.emp.controller;

import com.emp.base.BaseController;
import com.emp.factory.ServiceFactory;
import com.emp.model.Permission;
import com.emp.model.Role;
import com.emp.service.PermissionService;
import com.emp.service.RoleService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PermissionController
 */
public class PermissionController extends BaseController {
	private static final long serialVersionUID = 1L;
 String page;
       
    /**
     * @see BaseController#BaseController()
     */
    public PermissionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		Permission permission=new Permission();
		populate(request, permission);
		PermissionService service=ServiceFactory.getPermissionService();
		int result=service.insert(permission);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}
	
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		Permission permission=new Permission();
		populate(request, permission);
		PermissionService service=ServiceFactory.getPermissionService();
		int result=service.update(permission);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}

protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	
	Permission permission=new Permission();
	populate(request, permission);
	PermissionService service=ServiceFactory.getPermissionService();
	int result=service.delete(permission);
	if (result > 0) {
		System.out.println("success");
	} else {
		System.out.println("failure");
	}
	forward(request, response, page);
}

protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	
	Permission permission=new Permission();
	PermissionService service=ServiceFactory.getPermissionService();
	List result=service.select(permission);
	
}

}
