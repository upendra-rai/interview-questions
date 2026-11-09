package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q10. Sort employees by salary descending. If salaries are equal, sort by name alphabetically.
public class Question9 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Rahul", "IT", 50000.0, 25),
				new Employee("Amit", "HR", 70000.0, 28), new Employee("Vikas", "IT", 50000.0, 30),
				new Employee("Deepak", "Finance", 90000.0, 27), new Employee("Karan", "HR", 70000.0, 29));

		List<String> emps = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName))
				.map(e -> e.getName() + " - " + e.getSalary()).toList();
		System.out.println(emps);
	}

}
