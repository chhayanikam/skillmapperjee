package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.skillmapper.model.User;
import com.niit.skillmapper.repository.UserRepository;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Keep a set of strings to record form processing errors.
	List errorMsgs = new LinkedList();
	UserRepository userrepository = new UserRepository();

	public RegistrationController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		// Store this set in the request scope, in case we need to
		// send the ErrorPage view.
		request.setAttribute("errorMsgs", errorMsgs);

		String employeeId = request.getParameter("employeeId").trim();
		String employeeName = request.getParameter("employeeName").trim();
		String empPassword = request.getParameter("emppassword").trim();
		String email = request.getParameter("email").trim();
		String deptname = request.getParameter("deptname").trim();
		String role_type = request.getParameter("role_type").trim();
		System.out.println(employeeId + employeeName + empPassword + deptname + email + role_type);
		int empid = Integer.parseInt(employeeId);
		User user = new User();
		user.setEmployeeId(employeeId);
		user.setEmployeeName(employeeName);
		user.setEmpPassword(empPassword);
		user.setEmail(email);
		user.setDeptname(deptname);
		user.setRole_type(role_type);
		
		//user.validate();
		userrepository.add(user);
		HashMap LoginErrors = new HashMap<String, String>();
		LoginErrors = user.validate();
		if (LoginErrors.size() > 0)
		{
			session.setAttribute("errors", LoginErrors);
			request.getRequestDispatcher(getServletContext().getInitParameter("views") + "login.jsp")
			        .include(request,response);
		}
		else
		{
			request.getRequestDispatcher(getServletContext().getInitParameter("views") + "success.jsp")
	        .include(request,response);
			
		}
	}
}

