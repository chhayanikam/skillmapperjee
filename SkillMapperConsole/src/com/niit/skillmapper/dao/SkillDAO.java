package com.niit.skillmapper.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.niit.skillmapper.model.Skills;

public interface SkillDAO {
	boolean add(Skills skill);
	boolean delete(String email);
	boolean update(Skills skill);
	ArrayList search(String keywords);
}
