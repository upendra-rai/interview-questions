package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//1. Filter employees and calculate annual salary
//Find employees whose monthly salary is greater than 40,000.,
//Convert their monthly salary into annual salary.,
//Extract employee names along with annual salary.

public class Question1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25, true),
				new Employee(2, "Rahul", 60000, "HR", 28, true), new Employee(3, "Ankit", 75000, "IT", 30, true),
				new Employee(4, "Vikas", 35000, "Finance", 26, false), new Employee(5, "Rohit", 90000, "IT", 35, true));

		employees.stream().filter(emp -> emp.getSalary() > 40000).map(emp -> {
			return String.valueOf(emp.getName() + " - " + emp.getSalary() * 12);
		}).toList().forEach(System.out::println);

	}

}
