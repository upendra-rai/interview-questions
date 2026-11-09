package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//6. Filter employees based on age and salary
//Age must be between 25 and 35 (inclusive)., Salary must be greater than 50,000.
//Extract employee names., - Convert names into uppercase.
public class Question6 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25, true),
				new Employee(2, "Rahul", 60000, "HR", 28, true), new Employee(3, "Ankit", 75000, "IT", 30, true),
				new Employee(4, "Vikas", 35000, "Finance", 26, false), new Employee(5, "Rohit", 90000, "IT", 35, true));

		employees.stream().filter(e -> e.getAge() > 25 && e.getAge() < 35 && e.getSalary() > 50000)
				.map(e -> e.getName().toUpperCase()).toList().forEach(System.out::println);

	}

}
