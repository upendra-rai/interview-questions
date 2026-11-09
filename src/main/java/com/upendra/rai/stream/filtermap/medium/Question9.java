package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//Department must be IT, Salary must be greater than 50,000 , Age must be greater than 25.
//Calculate a 20% bonus, Return employee name and bonus amount.

public class Question9 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25, true),
				new Employee(2, "Rahul", 60000, "HR", 28, true), new Employee(3, "Ankit", 75000, "IT", 30, true),
				new Employee(4, "Vikas", 35000, "Finance", 26, false), new Employee(5, "Rohit", 90000, "IT", 35, true));

		employees.stream().filter(e -> e.getDepartment().equals("IT") && e.getSalary() > 50000 && e.getAge() >= 25)
				.map(e -> {
					double bonus = e.getSalary() * 20 / 100;
					return String.valueOf(e.getName() + " - " +  bonus);
				}).toList().forEach(System.out::println);

	}

}
