package com.elsie.services;

import com.elsie.employee.Employee;

public interface Credentials {
	String generateEmailId(String FirstName, String LastName,String dept);
	String generatePassword();
	void showDetails(Employee employee1);

}
