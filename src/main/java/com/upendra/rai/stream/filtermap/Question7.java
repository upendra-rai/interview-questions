package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//7. Filter IT department employees and increase salary by 10%
//[44000.0, 82500.0, 55000.0]
public class Question7 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 25),
				new Employee(2, "Rahul", 60000, "HR", 28), new Employee(3, "Ankit", 75000, "IT", 30),
				new Employee(4, "Vikas", 50000, "IT", 26));

		employees.stream().filter(e -> e.getDepartment().equals("IT")).map(e ->e.getSalary()+ (e.getSalary() * 10 / 100))
				.toList().forEach(System.out::println);
	}

}
