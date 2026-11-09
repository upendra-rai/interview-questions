package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question9 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", Arrays.asList("Java", "Spring", "AWS")),
				new Employee("David", Arrays.asList("Python", "Java", "Docker")),
				new Employee("Alex", Arrays.asList("AWS", "Kubernetes", "Spring")));
		
		List<String>data=employees.stream().flatMap(e->e.getSkills().stream()).distinct().toList();
		System.out.println(data);
		
	}

}
