package com.niit.skillmapper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.niit.skillmapper.dao.ProfileDAO;
import com.niit.skillmapper.model.*;
import com.niit.skillmapper.utility.DbConnect;


public class ProfileRepository implements ProfileDAO {
	DbConnect db;
	Connection con;

	public ProfileRepository() {
		db = new DbConnect();
		con = db.getConnection();
	}

	@Override
	public boolean add(Profile user) {
		try {
			con = db.getConnection();
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO userprofile (profileid,employeeid,city,region,qualification,"
					+ "supervisorname,profileviews,profileselected,profilephoto)"
							+ " values (?, ?,?,?,?,?,?,?,?)");
			stmt.setInt(1, user.getProfileId());
			stmt.setInt(2, user.getEmployeeId());
			stmt.setString(3, user.getCity());
			stmt.setString(4, user.getRegion());
			stmt.setString(5, user.getQualification());
			stmt.setString(6, user.getSupervisorname());
			stmt.setInt(7, user.getProfileviews());
			stmt.setInt(8, 0);// 0 means not set. 1=set for profileselected
			stmt.setString(9, user.getProfilephoto());			
			int res1=stmt.executeUpdate();
			con.close();
			if(res1==1)
			{
			System.out.println("record added");
			return true;
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return false;	
	}

	@Override
	public boolean delete(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Profile profile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean profileApproval(Profile profile) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// method to add the user to the table
	/*	@Override
		public boolean add(Profile profile) {
			try {
				Connection con = db.getConnection();
				PreparedStatement stmt = con.prepareStatement(
						"INSERT INTO userinfo (employeeid, employeename,email,emppassword,role_type,deptname)"
								+ " values (?, ?, ?,?,?,?)");
				stmt.setString(1, user.getEmployeeId());
				stmt.setString(2, user.getEmployeeName());
				stmt.setString(3, user.getEmail());
				stmt.setString(4, user.getEmpPassword());
				stmt.setString(5, user.getRole_type());
				stmt.setString(6, user.getDeptname());
				stmt.executeUpdate();
				con.close();
				System.out.println("record added");
				return true;
			} catch (SQLException e) {
				System.out.println(e);
			}
			return false;
		}

		@Override
		public boolean delete(String email) {
			// TODO Auto-generated method stub
			try {
				Connection con = db.getConnection();
				PreparedStatement stmt = con.prepareStatement("DELETE FROM userinfo WHERE email=?");
				stmt.setString(1, email);
				stmt.executeUpdate();
				con.close();
				return true;
			} catch (SQLException e) {
				System.out.println(e);
			}
			return false;
		}

		@Override
		public boolean update(User user) {
			// TODO Auto-generated method stub
			try {
				Connection c = db.getConnection();

				PreparedStatement stmt = c.prepareStatement(
						"UPDATE userinfo SET employeename=?, emppassword=?,role_type=?," + "deptname=?" + " WHERE email=?");
				stmt.setString(1, "testname");
				stmt.setString(2, "testpassword");
				stmt.setString(3, "testrole");
				stmt.setString(4, "testname");
				stmt.setString(5, "chhaya.nikam@niit.com");
				stmt.executeUpdate();
				c.close();
				return true;
			} catch (SQLException e)
			{
				System.out.println(e);
				return false;
			}
*/
			
}
