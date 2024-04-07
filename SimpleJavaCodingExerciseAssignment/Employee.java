package javacodingexercise;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String city;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	// AddEmployee class
	class AddEmployee {
	    private List<Employee> list = new ArrayList<>();

	    // Method to add a new employee
	    public void addEmployee(Employee emp) {
	        list.add(emp);
	    }

	    // Method to get an employee by ID
	    public Employee getEmployee(int id) {
	        for (Employee emp : list) {
	            if (emp.getId() == id) {
	                return emp;
	            }
	        }
	        return null; // Employee not found
	    }
	}
}

