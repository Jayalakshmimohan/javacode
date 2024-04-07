package javacodingexercise;

import java.util.ArrayList;
import java.util.List;

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

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        // Creating instance of AddEmployee
        AddEmployee addEmployee = new AddEmployee();

        // Adding some employees
        addEmployee.addEmployee(new Employee(1, "John Doe", "New York"));
        addEmployee.addEmployee(new Employee(2, "Jane Smith", "Los Angeles"));

        // Getting an employee by ID
        Employee employee = addEmployee.getEmployee(1);
        if (employee != null) {
            System.out.println("Employee found: " + employee.getName());
        } else {
            System.out.println("Employee not found");
        }
    }
}
