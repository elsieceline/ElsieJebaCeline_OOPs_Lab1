package com.elsie.main;
import java.util.Scanner;

import com.elsie.employee.Employee;
import com.elsie.services.Implementation;

public class Driver {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first name:");
		String FirstName=sc.nextLine();
		System.out.println("Enter your last name:");
		String LastName=sc.nextLine();
		Employee employee1=new Employee(FirstName, LastName);
		Implementation credentials=new Implementation();
		System.out.println("Enter your department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		int department=sc.nextInt();
		String generateemial="";
		String generatepassword="";
		switch(department)
		{
		case 1:
			generateemial=credentials.generateEmailId(employee1, "tech");

			break;
		case 2:
			generateemial=credentials.generateEmailId(employee1, "admin");
			break;
		case 3:
			generateemial=credentials.generateEmailId(employee1, "hr");
			break;
		case 4:
			generateemial=credentials.generateEmailId(employee1, "legal");
			break;
		default:
			System.out.println("Please enter valid choice");

		}
		generatepassword=credentials.generatePassword();
		employee1.setEmail(generateemial);
		employee1.setPassword(generatepassword);

		credentials.showDetails(employee1);
	}


}


