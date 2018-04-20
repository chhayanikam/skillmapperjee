package com.niit.skillmapper.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.skillmapper.model.Skills;
import com.niit.skillmapper.repository.SkillRepository;;

public class TestSkillRepository {
	SkillRepository skillrepository;

	@Before
	public void setUp() throws Exception {
		skillrepository = new SkillRepository();
	}

	// failed test case
	@Ignore
	@Test
	public void FailaddSkillTest() {
		Skills skill=new Skills();
		skill.setEmployeeid(18776);
		skill.setSkillType("Java");
		skill.setCertifications("Oracle:OCJP");;
		skill.setFeedbackRating(4);
		skill.setSkillDesc("Java");
		skill.setStudentsTrained(1700);
		skill.setTeachingHrs(100);
		assertEquals("Failed to add the skill!", true, skillrepository.add(skill));
	}

	@Ignore
	@Test
	public void addSkillTest() {
		Skills skill=new Skills();
		skill.setEmployeeid(18776);
		skill.setSkillType("Java");
		skill.setCertifications("Oracle OCJP");;
		skill.setFeedbackRating(4);
		skill.setSkillDesc("Java");
		skill.setStudentsTrained(1700);
		skill.setTeachingHrs(100);
		assertEquals("Failed to add the skill!", true, skillrepository.add(skill));
	}


	@Test
	public void searchSkillTest(){
	assertEquals(" problem in fetching skills!", 4, skillrepository.search("OCJP").size());
	}
}

