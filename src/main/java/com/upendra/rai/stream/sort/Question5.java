package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q6. Sort employees by salary in ascending order.
public class Question5 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Rahul", "IT", 50000.0, 25),
				new Employee("Amit", "HR", 30000.0, 28), new Employee("Vikas", "IT", 70000.0, 30),
				new Employee("Deepak", "Finance", 40000.0, 27));

		List<String> emps = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).map(e -> {
			return String.valueOf(e.getName() + " - " + e.getSalary());
		}).toList();
		System.out.println(emps);

	}
}
