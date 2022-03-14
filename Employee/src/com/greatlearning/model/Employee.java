package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String department;
	
	public Employee(String firstname, String lastName, String emailId, String password, String department) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password =  password;
		this.password = password;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + ", department=" + department + "]";
	}
}
