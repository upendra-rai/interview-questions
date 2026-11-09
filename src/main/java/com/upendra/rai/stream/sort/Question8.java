package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q9. Sort employees by department alphabetically, then by salary descending.
public class Question8 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Rahul", "IT", 50000.0, 25),
				new Employee("Amit", "HR", 30000.0, 28), new Employee("Vikas", "IT", 70000.0, 30),
				new Employee("Deepak", "Finance", 40000.0, 27), new Employee("Karan", "HR", 60000.0, 29));

		List<String> emps = employees.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary,
						Comparator.reverseOrder()))
				.map(e -> e.getName() + " - " + e.getDepartment() + " - " + e.getSalary()).toList();
		System.out.println(emps);
	}
}
