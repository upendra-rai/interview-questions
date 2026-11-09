package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;



public class Question5 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("John", Arrays.asList("Java", "Spring", "AWS")),
				new Employee("David", Arrays.asList("Python", "Java", "Docker")),
				new Employee("Alex", Arrays.asList("AWS", "Kubernetes", "Spring")));
		
		List<String>skills=employees.stream().flatMap(e->e.getSkills().stream()).distinct().sorted().toList();
		
		System.out.println(skills);

	}

}
