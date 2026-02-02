package com.jagade.SpringBootMaven.employeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jagade.SpringBootMaven.Entity.Employee;
import com.jagade.SpringBootMaven.employeeService.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/EmployeeById")
	public Employee getEmployeeById(@RequestParam Integer id) {
		Employee employeeById = employeeService.getEmployeeById(id);
		return employeeById;
	}
	
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		
		
		return getAllEmployees();
		
	}
	
	@GetMapping("/EmployeeByName")
	 public Employee getEmployeeByName(@RequestParam String name) {
		 Employee byNameEmployee = employeeService.getByNameEmployee(name);
		return byNameEmployee;
		
		 
	 }
	@GetMapping("/EmployeeByLastName")
	 public Employee getEmployeeByLastName(@RequestParam String lastName) {
		 Employee byLastNameEmployee = employeeService.getByLastNameEmployee(lastName);
		return byLastNameEmployee;
		
		 
	 }
	@GetMapping("/EmployeeBySalary")
	public Employee getEmployeeBySalary(@RequestParam Double salary) {
		Employee employeeBySalary = employeeService.getBySalaryEmployee(salary);
		return employeeBySalary;
	}
	
}
