package test.java.com.niit.skillmapperbackend;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmapper.config.AppContext;
import com.niit.skillmapper.model.Profile;
import com.niit.skillmapper.service.EmployeeService;
import com.niit.skillmapper.service.ProfileService;
import com.niit.skillmapper.service.SkillService;

import junit.framework.Assert;
import com.niit.skillmapper.*;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class ProfileTest {
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private SkillService skillService;
	
	// Test this method-not working
	@Ignore
	@Test
	public void testFindProfile()
	{			
		assertEquals("record not found!","Mumbai",profileService.findProfile(102).getCity()); //Ensures type is Expression
	}
	
	
	@Test
	public void testAddprofile() {			
		Profile p=new Profile();
		p.setEmployeeId(103);
		p.setCity("Mumbai");
		p.setProfilephoto(null);
		p.setQualification("MCA");
		p.setSupervisorname("Annu");
		p.setRegion("R01");
		p.setProfileviews(0);
		assertEquals("failed to add the profile",true, profileService.add(p));
				
	}
	
	// TS to approve the Employee by HR, profilected should be made 1
	@Ignore
	@Test
	public void testHRApproval()
	{
		Profile profile=profileService.findProfile(102);
		assertEquals(true,profileService.profileApproval(profile));	
	}

	@Test
	public void testDeleteProfile()
	{
		assertEquals(true,profileService.delete(102));
	}
	@Ignore
	@Test
	public void testListAllprofile() {			
	assertEquals("failed to fetch the records",true, profileService.ListAllProfiles());
				
	}

}
