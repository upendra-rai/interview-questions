package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//6. Find the top 3 highest unique employee salaries.
//[90000.0, 80000.0, 70000.0]
public class Question6 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Rahul", 50000.0), new Employee("Amit", 70000.0),
				new Employee("Vikas", 60000.0), new Employee("Deepak", 70000.0), new Employee("Karan", 90000.0),
				new Employee("Rohit", 80000.0));

		List<Double> data = employees.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).limit(3)
				.toList();
		System.out.println(data);

	}

}
