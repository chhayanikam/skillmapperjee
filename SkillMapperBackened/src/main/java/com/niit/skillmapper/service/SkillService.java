package com.niit.skillmapper.service;

import java.util.List;

import com.niit.skillmapper.model.Skills;

public interface SkillService {
	boolean add(Skills skill);
	boolean delete(Skills skil);
	boolean update(Skills profile);	
	List<Skills> getAllSkills();// list all records 
	List<Skills> SearchSkills(String keywords);
}
