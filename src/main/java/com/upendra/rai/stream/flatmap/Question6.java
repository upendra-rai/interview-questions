package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", Arrays.asList("Java", "Spring Boot")),
				new Employee("David", Arrays.asList("Python", "Django")),
				new Employee("Alex", Arrays.asList("Java", "AWS", "Docker")));
		
		List<String>skills=employees.stream().flatMap(e->e.getSkills().stream()).toList();
		System.out.println(skills);
	}

}
