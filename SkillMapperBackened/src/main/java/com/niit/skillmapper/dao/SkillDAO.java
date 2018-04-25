package com.niit.skillmapper.dao;

import java.util.List;

import com.niit.skillmapper.model.Skills;;

public interface SkillDAO {
	boolean add(Skills skill);
	boolean delete(Skills skill);
	boolean update(Skills skill);	
	Skills findByEmployeeId(int empId);
	List<Skills> getAllSkills();// list all records 
	List<Skills> SearchSkills(String keywords);
}
