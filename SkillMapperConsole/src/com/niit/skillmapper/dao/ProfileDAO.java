package com.niit.skillmapper.dao;
import com.niit.skillmapper.model.Profile;

public interface ProfileDAO {
	boolean add(Profile profile);
	boolean delete(String email);
	boolean update(Profile profile);
	boolean profileApproval(Profile profile );
}

