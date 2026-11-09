package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//Find only active employees.,Salary must be greater than 50,000.

//Convert Employee objects into EmployeeDTO. DTO should contain id, name, and salary.
public class Question2 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25, true),
				new Employee(2, "Rahul", 60000, "HR", 28, true), new Employee(3, "Ankit", 75000, "IT", 30, true),
				new Employee(4, "Vikas", 35000, "Finance", 26, false), new Employee(5, "Rohit", 90000, "IT", 35, true));

		employees.stream().filter(e -> e.isActive() && e.getSalary() > 50000).map(e -> {
			Employeedto dto = new Employeedto(e.getId(), e.getName(), e.getSalary());
			return dto;
		}).toList().forEach(System.out::println);
	}

}
