package com.jagade.SpringBootMaven.employeeServiceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jagade.SpringBootMaven.Entity.Employee;
import com.jagade.SpringBootMaven.employeeService.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sandeep","Jagade",10000.00));
		employees.add(new Employee(2, "Prasad", "Siddapur", 15000.00));
		employees.add(new Employee(3, "Amrut", "Mirzi", 25000.00));
		
		Optional<Employee> optionalemployee = employees.stream().filter(emp -> emp.getId() == id).findAny();
		if(optionalemployee.isPresent()) {
			Employee employee = optionalemployee.get();
			return employee;
		}
		
		return optionalemployee.orElseThrow();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sandeep","Jagade",10000.00));
		employees.add(new Employee(2, "Prasad", "Siddapur", 15000.00));
		employees.add(new Employee(3, "Amrut", "Mirzi", 25000.00));
		return getAllEmployee();
	}

	@Override
	public Employee getByNameEmployee(String name) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sandeep","Jagade",10000.00));
		employees.add(new Employee(2, "Prasad", "Siddapur", 15000.00));
		employees.add(new Employee(3, "Amrut", "Mirzi", 25000.00));
		
		Optional<Employee> optionalEmployee = employees.stream().filter(emp -> emp.getName().equals(name)).findAny();
		if(optionalEmployee.isPresent()) {
			Employee employee = optionalEmployee.get();
			return employee;
		}
		return optionalEmployee.orElseThrow();
	}

	@Override
	public Employee getByLastNameEmployee(String lastName) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sandeep","Jagade",10000.00));
		employees.add(new Employee(2, "Prasad", "Siddapur", 15000.00));
		employees.add(new Employee(3, "Amrut", "Mirzi", 25000.00));
		
		Optional<Employee> optionalEmployee = employees.stream().filter(emp -> emp.getLastName().equals(lastName)).findAny();
		if(optionalEmployee.isPresent()) {
			Employee employee = optionalEmployee.get();
			return employee;
		}
		return optionalEmployee.orElseThrow();
	}
	

	@Override
	public Employee getBySalaryEmployee(Double salary) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sandeep","Jagade",10000.00));
		employees.add(new Employee(2, "Prasad", "Siddapur", 15000.00));
		employees.add(new Employee(3, "Amrut", "Mirzi", 25000.00));
		 Optional<Employee> optionalEmployee = employees.stream().filter(emp -> emp.getSalary().equals(salary)).findAny();
		 if(optionalEmployee.isPresent()) {
			 Employee employee = optionalEmployee.get();
			 return employee;
		 }
		return optionalEmployee.orElseThrow();
	}

}
