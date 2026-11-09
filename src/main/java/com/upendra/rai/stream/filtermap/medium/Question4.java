package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//4. Filter employees by department and convert names
//Find employees from IT and HR departments.,Salary must be greater than 45,000.
//- Convert names into uppercase.
public class Question4 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25, true),
				new Employee(2, "Rahul", 60000, "HR", 28, true), new Employee(3, "Ankit", 75000, "IT", 30, true),
				new Employee(4, "Vikas", 35000, "Finance", 26, false), new Employee(5, "Rohit", 90000, "IT", 35, true));

		employees.stream().filter(e -> e.getDepartment().equals("IT") && e.getSalary() >= 45000)
				.map(e -> e.getName().toUpperCase()).toList().forEach(System.out::println);
	}

}
