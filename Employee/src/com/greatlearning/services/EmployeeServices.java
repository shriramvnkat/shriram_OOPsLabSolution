package com.greatlearning.services;

import com.greatlearning.model.Employee;

public class EmployeeServices {
	public Employee employee;
	public CredentialService credentialService = new CredentialService();
	
	public EmployeeServices(String firstname, String lastName, String department) {
		employee = new Employee(firstname,lastName, credentialService.generateEmail(firstname,lastName,department),credentialService.generatePassword(),department);
	}
	
	public String showDetails() {
		return employee.toString();
	}
	
	
}
