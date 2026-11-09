package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;

public class Question9 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", Arrays.asList("Bangalore", "Delhi")),
				new Employee("David", Arrays.asList("Mumbai", "Bangalore")),
				new Employee("Alex", Arrays.asList("Chennai", "Delhi")));
		List<String> cities = employees.stream().flatMap(emp -> emp.getSkills().stream()).distinct().sorted().toList();
		System.out.println(cities);
	}

}
