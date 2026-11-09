package com.upendra.rai.medium.level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				// IT Department
				new Employee(1, "Amit", 40000, "IT", 25), new Employee(2, "Ankit", 75000, "IT", 30),
				new Employee(3, "Rohit", 55000, "IT", 28),
				// HR Department
				new Employee(4, "Rahul", 60000, "HR", 28), new Employee(5, "Priya", 45000, "HR", 26),
				new Employee(6, "Neha", 65000, "HR", 32),
				// Finance Department
				new Employee(7, "Vikas", 45000, "Finance", 26), new Employee(8, "Suresh", 70000, "Finance", 35),
				new Employee(9, "Pankaj", 50000, "Finance", 29));

		// FIRST METHOD
		Map<String, Employee> data1 = new HashMap<>();
		List<String> depts = employees.stream().map(e -> e.getDepartment()).toList();
		for (String dept : depts) {
			Employee maxEmployee = employees.stream().filter(e -> e.getDepartment().equals(dept))
					.max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
			data1.put(dept, maxEmployee);
		}
		for (Map.Entry<String, Employee> entry : data1.entrySet()) {
			//System.out.println(entry.getKey() + " : " + entry.getValue());
			//System.out.println();
		}

		// SECOND METHOD
		Map<String, Optional<Employee>> data = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		data.forEach((dept, emp) -> {
			System.out.println("Department: " + dept);
			System.out.println("Highest Salary Employee: " + emp.orElse(null));
		});

	}

}
