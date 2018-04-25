package com.niit.skillmapper.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.skillmapper.model.User;
import com.niit.skillmapper.repository.UserRepository;

public class UserRepositoryTest {

	UserRepository userrepository;

	@Before
	public void setUp() throws Exception {
		userrepository = new UserRepository();
	}

	// failed-negative test case
	@Test
	public void testFailAuthUserFail() {
		assertEquals("Failed to validate the user!", true,
				userrepository.authenticate("chhaya.nikam@nt.com", "password"));
	}

	// positive test case
	@Ignore
	@Test
	public void testAuthUser() {
		assertEquals("Failed to validate the user!", true,
				userrepository.authenticate("chhaya.nikam@nt.com", "password"));
	}

	@Ignore
	@Test
	public void addUserTest() {
		User user = new User();
		user.setEmployeeId(18777);
		user.setEmployeeName("Riya");
		user.setDeptname("CEB");
		user.setEmail("riya@niit.com");
		user.setRole_type("Trainer");
		user.setEmpPassword("password@123");
		assertEquals("Failed to add the user!", true, userrepository.add(user));
	}

	// negative test case
	@Ignore
	@Test
	public void addUserTestFail() {
		User user = new User();
		user.setEmployeeId(18776);
		user.setEmployeeName("Riya");
		user.setDeptname("CEB");
		user.setEmail("riya@niit.com");
		user.setRole_type("Trainer");
		user.setEmpPassword("password@123");
		assertEquals("Failed to add the user!", true, userrepository.add(user));
	}
	@Test
	public void updateUserTest() {		
		User euser=new User();		
		euser.setEmployeeName("Riyanew");
		euser.setDeptname("CEBnew");
		euser.setEmail("riya@niit.com");
		euser.setRole_type("Trainer1");
		euser.setEmpPassword("password1@123");
		assertEquals("Failed to update the user!", true, userrepository.update(euser));
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
