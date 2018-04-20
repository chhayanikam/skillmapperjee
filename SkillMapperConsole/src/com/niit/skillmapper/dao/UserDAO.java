package com.niit.skillmapper.dao;

import com.niit.skillmapper.model.User;

public interface UserDAO {
	// user related operation
	User getByEmail(String email);
	boolean add(User user);
	boolean delete(String email);
	boolean update(User user);
	boolean authenticate(String email, String password) ;
}
