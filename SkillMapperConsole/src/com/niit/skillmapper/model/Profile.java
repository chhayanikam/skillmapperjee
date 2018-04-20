package com.niit.skillmapper.model;

import java.beans.Transient;

public class Profile {
	private int profileId;
	private int employeeId;	
	private String email;
	private String city;
	private String region;
	private String qualification;
	private String supervisorname;
	private int profileviews;
	private int profileselected;
	private String profilephoto ;
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSupervisorname() {
		return supervisorname;
	}
	public void setSupervisorname(String supervisorname) {
		this.supervisorname = supervisorname;
	}
	public int getProfileviews() {
		return profileviews;
	}
	public void setProfileviews(int profileviews) {
		this.profileviews = profileviews;
	}
	public int getProfileselected() {
		return profileselected;
	}
	public void setProfileselected(int profileselected) {
		this.profileselected = profileselected;
	}
	public String getProfilephoto() {
		return profilephoto;
	}
	public void setProfilephoto(String profilephoto) {
		this.profilephoto = profilephoto;
	}
	
}
