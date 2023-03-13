package com.elsie.services;

import java.util.Random;

import com.elsie.employee.Employee;

public class Implementation {
	public String generateEmailId(String FirstName, String LastName, String dept)
	{

		return FirstName+LastName+"@"+dept+".abc.com";
	}
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String splchars="!@#$%^&*()";

		String password=caps+lower+numbers+splchars;


		String mypassword="";  
		Random random=new Random();

		for(int i=0;i<8;i++)
		{
			mypassword=mypassword+String.valueOf(password.charAt(random.nextInt(password.length())));	
		}

		return mypassword;
	}
	public void showDetails(Employee employee1) {
		System.out.println("Dear "+employee1.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Employee First Name is "+ employee1.getFirstName());
		System.out.println("Employee Last Name is "+ employee1.getLastName());
		System.out.println("Employee Email  is "+ employee1.getEmail());
		System.out.println("Employee Password is "+ employee1.getPassword());

	}

	public String generateEmailId(Employee employee1, String dept) {
		String mypassword=employee1.getFirstName().toLowerCase() + employee1.getLastName().toLowerCase()+"@"+dept+".abc.com";
		return mypassword;
	}

}


