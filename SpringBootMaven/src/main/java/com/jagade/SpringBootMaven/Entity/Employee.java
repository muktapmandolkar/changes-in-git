package com.jagade.SpringBootMaven.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {
	
	private Integer id;
	private String name ;
	private String lastName;
	private Double salary;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Employee(Integer id, String name, String lastName, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	
	
	

}
