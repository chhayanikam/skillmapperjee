package com.niit.skillmapper.utility;

import java.sql.*;
import java.util.*;
import java.io.*;

public class DbConnect {
	private String database;
	private String dbuser;
	private String dbpassword;
	private String driver;
	Connection con;

	
	public DbConnect() {
		super();
	   con=getConnection();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDatabase() {
		return database;
	}

	public String getDbuser() {
		return dbuser;
	}

	public String getDbpassword() {
		return dbpassword;
	}

	// convert this to a static class
	// method to load the data from properties file
	public  void readPropertiesFile() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("E:\\SkillMapper\\SkillMapperConsole\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			this.database = prop.getProperty("database");
			this.dbuser = prop.getProperty("dbuser");
			this.dbpassword = prop.getProperty("dbpassword");
			this.driver = prop.getProperty("driver");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// establish the database connection
	public Connection getConnection() {
		
		try {
			readPropertiesFile();
			// step1 load the driver class
			Class.forName(this.getDriver());

			// step2 create the connection object
			con = DriverManager.getConnection(this.getDatabase(), this.getDbuser(), this.getDbpassword());
		
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	
	
}
