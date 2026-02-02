package com.jagade.SpringBootMaven.employeeService;

import java.util.List;

import com.jagade.SpringBootMaven.Entity.Employee;

public interface EmployeeService {

	public Employee getEmployeeById(Integer id);
	public List<Employee> getAllEmployee();
	public Employee getByNameEmployee(String name);
	public Employee getByLastNameEmployee(String lastName);
	public Employee getBySalaryEmployee(Double salary);

	
}
