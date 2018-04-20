package com.niit.skillmapper.model;

public class Skills {	
	private int employeeid;
	private String skillType;
	private String skillDesc;
	private String certifications;
	private int teachingHrs;
	private int studentsTrained;
	private int feedbackRating;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public int getTeachingHrs() {
		return teachingHrs;
	}
	public void setTeachingHrs(int teachingHrs) {
		this.teachingHrs = teachingHrs;
	}
	public int getStudentsTrained() {
		return studentsTrained;
	}
	public void setStudentsTrained(int studentsTrained) {
		this.studentsTrained = studentsTrained;
	}
	public int getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
		
}
