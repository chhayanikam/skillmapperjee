package com.niit.skillmapper.dao;
import java.util.List;

import com.niit.skillmapper.model.*;

	public interface ProfileDAO {
		boolean add(Profile profile);
		boolean delete(int profileId);
		boolean update(Profile profile);
		boolean profileApproval(Profile profile );
		public List<Profile> getAllProfiles();
		Profile findProfile(int empId);
		List<Profile> PendingForApproval();
		List<Profile> ListAllProfiles();
	}



