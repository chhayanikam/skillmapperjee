package com.niit.skillmapper.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.niit.skillmapper.model.Profile;
import com.niit.skillmapper.repository.ProfileRepository;

public class TestProfileRepository {
	ProfileRepository profilerepository;

	
	@Before
	public void setUp() throws Exception {
		profilerepository = new ProfileRepository();
	
	}
	
	@Test
	public void addProfileTest() {
		Profile profile=new Profile();
		profile.setProfileId(1);
		profile.setEmployeeId(18776);
		profile.setCity("Mumbai");		
		profile.setProfilephoto("p1.jpg");
		profile.setProfileviews(0);
		profile.setProfileselected(0);
		profile.setQualification("MCA");
		profile.setRegion("R01");
		profile.setSupervisorname("Vidhya");
		assertEquals("Failed to add the profile!", true,profilerepository.add(profile));
	}

}
