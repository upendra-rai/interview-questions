package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.upendra.rai.stream.filter.Employee;

//Extract only employee names using map().
public class Question6 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 75000), new Employee(4, "Vikas", 50000));
		
		List<String>empNames=employees.stream().map(e->e.getName()).collect(Collectors.toList());
		
		System.out.println(empNames);

	}

}
