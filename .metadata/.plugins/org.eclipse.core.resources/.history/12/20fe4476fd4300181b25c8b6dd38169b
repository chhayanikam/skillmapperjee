package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.niit.skillmapper.model.*;

import com.niit.skillmapper.repository.UserRepository;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	UserRepository userrepository = new UserRepository();
	boolean status = false;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		User user = new User();
		user.setEmail(email);
		user.setEmpPassword(password);
		HashMap LoginErrors = new HashMap<String, String>();
		LoginErrors = user.validate();
		if (LoginErrors.size() > 0) {
			session.setAttribute("errors", LoginErrors);
			request.getRequestDispatcher(getServletContext().getInitParameter("views") + "login.jsp").include(request,
					response);
		}
		else
		{			
			request.getRequestDispatcher(getServletContext().getInitParameter("views") + "home.jsp").include(request,
					response);
		}
	}

}
