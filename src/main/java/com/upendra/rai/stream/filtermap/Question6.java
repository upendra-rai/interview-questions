package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//6. Filter employees by salary and extract names employees whose salary is greater than 50,000.
//[Rahul, Ankit]
public class Question6 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25),
				new Employee(2, "Rahul", 60000, "HR", 28), new Employee(3, "Ankit", 75000, "IT", 30),
				new Employee(4, "Vikas", 45000, "Finance", 26));
		employees.stream().filter(e -> e.getSalary() > 50000).map(e -> e.getName()).toList()
				.forEach(System.out::println);

	}

}
