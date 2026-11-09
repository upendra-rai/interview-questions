package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;

import com.upendra.rai.stream.filter.Employee;

//Find employees whose salary is greater than 50,000 and extract only their names.
public class Question10 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 75000), new Employee(4, "Vikas", 30000));

		List<String> data = employees.stream().filter(e -> e.getSalary() > 50000).map(e -> e.getName()).toList();

		System.out.println(data);

	}

}
