package test.java.com.niit.skillmapperbackend;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmapper.config.AppContext;
import com.niit.skillmapper.model.Skills;
import com.niit.skillmapper.service.ProfileService;
import com.niit.skillmapper.service.SkillService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class SkillTest {
	@Autowired
	private SkillService skillService;
	
	@Test
	public void getAllSkills()
	{
		assertEquals("Matching skills not found!",1,skillService.getAllSkills().size());
	}
	@Ignore
	@Test
	public void searchSkills()
	{
		assertEquals("Matching skills not found!",1,skillService.SearchSkills("java").size());
	}
	
	@Ignore
	@Test
	public void testAddSkill()
	{
		Skills skill=new Skills();
		skill.setEmployeeid(102);
		skill.setStudentsTrained(120);
		skill.setTeachingHrs(22);
		skill.setCertifications("ms sql java oracle");
		skill.setFeedbackRating(4);
		skill.setSkillDesc("java,c++,sql");
		skill.setSkillType("Java");
		assertEquals("Failed to add the skill",true,skillService.add(skill));
	}

}
