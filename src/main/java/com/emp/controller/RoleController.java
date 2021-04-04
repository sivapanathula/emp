package com.emp.controller;

import com.emp.base.BaseController;
import com.emp.factory.ServiceFactory;
import com.emp.model.Role;
import com.emp.service.RoleService;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RoleController
 */
public class RoleController extends BaseController {
	private static final long serialVersionUID = 1L;
	private String page;
       
    /**
     * @see BaseController#BaseController()
     */
    public RoleController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		Role role=new Role();
		populate(request, role);
		RoleService service=ServiceFactory.getRoleService();
		int result=service.insert(role);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}
	
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		Role role=new Role();
		populate(request, role);
		RoleService service=ServiceFactory.getRoleService();
		int result=service.update(role);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}

protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	
	Role role=new Role();
	populate(request, role);
	RoleService service=ServiceFactory.getRoleService();
	int result=service.delete(role);
	if (result > 0) {
		System.out.println("success");
	} else {
		System.out.println("failure");
	}
	forward(request, response, page);
}

public void select(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException, SQLException {
	Role role = new Role();
	RoleService service = ServiceFactory.getRoleService();
	service.select(role);

}
}
