package com.elsie.employee;

public class Employee {
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	public Employee() {}
	public Employee(String FirstName, String LastName) {
		super();
		this.FirstName=FirstName;
		this.LastName=LastName;

	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
