package dev.sherpa.services;

import java.util.List;

import dev.sherpa.entities.Employee;

public interface EmployeeService {
	
	Employee getEmployeeByUp(String uname);
	
	List<Employee> getAllEmployee();
	
	public boolean check(String uname, String pword);
	
}
