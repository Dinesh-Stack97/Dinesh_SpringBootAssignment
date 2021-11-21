package com.Emplooyee_managemnt.App.model;

public class Employee {
	
	private String empId;
	private String empName;
	private long empSal;
	private String email;
	private String Place;
	public Employee(String empId, String empName, long empSal, String email, String place) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.email = email;
		Place = place;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}

	

	
	
}

