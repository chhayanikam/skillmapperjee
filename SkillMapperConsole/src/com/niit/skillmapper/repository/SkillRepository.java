package com.niit.skillmapper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.niit.skillmapper.dao.SkillDAO;
import com.niit.skillmapper.model.Skills;
import com.niit.skillmapper.utility.DbConnect;
import java.util.*;

public class SkillRepository implements SkillDAO {

	DbConnect db;
	Connection con;
	Statement stmt;

	public SkillRepository() {
		super();
		db = new DbConnect();
		con = db.getConnection();
	}

	@Override
	public boolean add(Skills skill) {
		try {
			con = db.getConnection();
			PreparedStatement stmt = con
					.prepareStatement("INSERT INTO skills (employeeid,skilltype,skilldesc,certifications,teachinghrs,"
							+ "studentstrained,feedbackrating)" + " values (?, ?,?,?,?,?,?)");
			stmt.setInt(1, skill.getEmployeeid());
			stmt.setString(2, skill.getSkillType());
			String arr[] = skill.getSkillDesc().split(" ");
			stmt.setString(3, arr.toString());
			stmt.setString(4, skill.getCertifications());
			stmt.setInt(5, skill.getTeachingHrs());
			stmt.setInt(6, skill.getStudentsTrained());
			stmt.setInt(7, skill.getFeedbackRating());

			int res1 = stmt.executeUpdate();
			con.close();
			if (res1 == 1) {
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
	public boolean update(Skills skill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList search(String keywords) {
		try {
			con = db.getConnection();
			stmt = con.createStatement();
			String sql = "select skills.employeeid ,skilltype,certifications,qualification from skills,userprofile where skills.employeeid=userprofile.employeeid	and certifications like '%"
					+ keywords + "%'";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			ArrayList<String> ResultList = new ArrayList<>(columnCount);
			while (rs.next()) {
				int i = 1;
				while (i <= columnCount) {
					ResultList.add(rs.getString(i++));
				}
			}
			con.close();
			return ResultList;
			}
			catch (SQLException e) {
			System.out.println(e);
			return null;
			}
		}

}
