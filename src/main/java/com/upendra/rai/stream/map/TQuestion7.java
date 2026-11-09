package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.upendra.rai.stream.filter.Employee;

public class TQuestion7 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 80000));

		int data = employees.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();

		System.out.println(data);

	}

}
