package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.tagplugins.jstl.core.Out;

import com.niit.skillmapper.utility.DbConnect;
import java.sql.*;
@WebServlet("/TestConnection")
public class TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DbConnect db;
	Connection con;
	PrintWriter out;
    /**
     * Default constructor. 
     */
    public TestConnection() {
      db=new DbConnect();
      con=db.getConnection();
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		out=response.getWriter();
		 try {
			 DbConnect db=new DbConnect();
				//Class.forName("org.h2.Driver");
				//Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/online", "sa", "");
			    Connection conn = db.getConnection();
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from product");
	System.out.println("in doget..............");
	rs.next();
				System.out.println("some db data=" + rs.getString(1));
				response.getWriter().println("I am in jdbc code");;		
	    	 }
	    	 catch (SQLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    	 
	    	

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
