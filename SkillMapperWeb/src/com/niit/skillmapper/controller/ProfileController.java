package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.niit.skillmapper.model.Profile;
import com.niit.skillmapper.repository.ProfileRepository;
import com.niit.skillmapper.validator.Validator;

public class ProfileController extends HttpServlet {
	// Keep a set of strings to record form processing errors.
		List errorMsgs = new LinkedList();
		ProfileRepository profilerepository = new ProfileRepository();

		public ProfileController() {
			super();
			// TODO Auto-generated constructor stub
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
			int profileId = Integer.parseInt(request.getParameter("profileId").trim());
			int employeeId = Integer.parseInt(request.getParameter("employeeId").trim());
			String city = request.getParameter("city").trim();
			String region = request.getParameter("region").trim();
			String qualification = request.getParameter("qualification").trim();
			String supervisorname=request.getParameter("supervisorname");
			String photo=request.getParameter("photo");
			int profileviews=0;
			int profileselected=0;
			
			System.out.println(profileId+employeeId + city + region + qualification + supervisorname + photo );
			Profile profileuser =new Profile(profileId,employeeId,city,region,qualification,supervisorname,profileviews,profileselected,photo);
						
			HashMap LoginErrors = new HashMap<String, String>();
			//LoginErrors = profileuser.validateEmployeeID(employeeID);
			
			if (LoginErrors.size() > 0)
			{
				session.setAttribute("errors", LoginErrors);
				request.getRequestDispatcher(getServletContext().getInitParameter("views") + "error.jsp")
				        .include(request,response);
			}
			else
			{
				profilerepository.add(profileuser);
				request.getRequestDispatcher(getServletContext().getInitParameter("views") + "success.jsp")
		        .include(request,response);
				
			}
		}

}
