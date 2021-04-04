package com.emp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.base.BaseController;
import com.emp.factory.DaoFactory;
import com.emp.factory.ServiceFactory;
import com.emp.model.Employee;
import com.emp.service.EmpService;
import com.emp.service.EmpServiceImpl;

/**
 * Servlet implementation class EmpController
 */
public class EmpController extends BaseController {
	private static final long serialVersionUID = 1L;
	private String page;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @throws SQLException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		/*
		 * int id=Integer.parseInt(request.getParameter("id")); String
		 * firstName=request.getParameter("firstName"); String
		 * lastName=request.getParameter("lastName"); String
		 * emailId=request.getParameter("emailId"); String
		 * password=request.getParameter("password");
		 */

		Employee employee = new Employee();
		populate(request, employee);

		/*
		 * employee.setId(id); employee.setFirstName(firstName);
		 * employee.setLastName(lastName); employee.setEmailId(emailId);
		 * employee.setPassword(password);
		 */

		//EmpServiceImpl service = new EmpServiceImpl();
		EmpService service = ServiceFactory.getEmpService();
		int result = service.insert(employee);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}
	
	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException{
		Employee employee = new Employee();
		populate(request, employee);
		EmpService service = ServiceFactory.getEmpService();
		int result = service.update(employee);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException{
		Employee employee = new Employee();
		populate(request, employee);
		EmpService service = ServiceFactory.getEmpService();
		int result = service.delete(employee);
		if (result > 0) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		forward(request, response, page);
	}

	public void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		Employee employee = new Employee();
		//EmpServiceImpl service = new EmpServiceImpl();
		EmpService service = ServiceFactory.getEmpService();
		service.select(employee);

	}

}
