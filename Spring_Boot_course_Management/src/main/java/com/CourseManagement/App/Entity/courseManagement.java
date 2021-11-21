package com.CourseManagement.App.Entity;

public class courseManagement {
	
	private String CourseId;
	private String CourseName;
	private String CourseDesc;
	private long Price;
	public courseManagement(String courseId, String courseName, String courseDesc, long price) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CourseDesc = courseDesc;
		Price = price;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseDesc() {
		return CourseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		CourseDesc = courseDesc;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}

	
}
