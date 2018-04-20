package com.niit.skillmapper.utility;
import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.niit.skillmapper.repository.UserRepository;
import javax.sql.*;

public class Main {	

	public static void main(String args[]) {
		UserRepository userrepository=new UserRepository();
				
		if(userrepository.authenticate("chhaya.nikam@niit.com", "password"))
		{
			System.out.println("Welcome user");
		}
		else
		{
			System.out.println("Access Denied");
		}
		
	
	}
}
