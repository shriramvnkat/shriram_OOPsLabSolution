package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.services.EmployeeServices;

public class DriverApplication {
	public static void main(String[] args) {
		System.out.print("Welcome to Employee Applications \n");
		int option = 0;
		EmployeeServices employeeServices = null;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Option 1 to create employee");
			System.out.println("Enter Option 2 to display employee");
			System.out.println("Enter Option 0 to Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("***** Create Employee ******");
				System.out.println("Enter First name");
				String firstName = scanner.next();
				System.out.println("Enter Last name");
				String lastName = scanner.next();
				System.out.println("---- Select Department name ----");
				System.out.println("Enter Option 1 For Technical");
				System.out.println("Enter Option 2 For Admin");
				System.out.println("Enter Option 3 For Human Resource");
				System.out.println("Enter Option 4 For Legal");
				int departValue = scanner.nextInt();
				String department = "";
				if(departValue == 1) {
					department = "Technical";
				} else if (departValue == 2 ) {
					department = "Admin";
				} else if (departValue == 3 ) {
					department = "HumanResource";
				} else if (departValue == 4 ) {
					department = "Legal";
				}
				employeeServices = new EmployeeServices(firstName,lastName,department);
				break;
			case 2:
				System.out.println("***** Display Employee Detail ******");
				System.out.println(employeeServices.showDetails());
				break;
			default:
				System.out.println("Please Enter the Right Option");
		} 
	}while(option != 0);
		scanner.close();
 }
}	
