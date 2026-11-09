package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//10. Find the top 3 highest-paid unique employees
//[Suresh - 95000.0, Karan - 90000.0, Amit - 80000.0]
public class Question10 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Rahul", 50000.0), new Employee("Amit", 80000.0),
				new Employee("Vikas", 70000.0), new Employee("Deepak", 80000.0), new Employee("Karan", 90000.0),
				new Employee("Rohit", 60000.0), new Employee("Suresh", 95000.0));

		Map<Double, Employee> employeeMap = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toMap(
						Employee::getSalary, Function.identity(), (existing, replacement) -> existing, TreeMap::new));

		//List<Employee> result = employeeMap.descendingMap().values().stream().limit(3).collect(Collectors.toList());

		//System.out.println(result);
	}
}
