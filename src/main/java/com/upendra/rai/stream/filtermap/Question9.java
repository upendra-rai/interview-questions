package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//9. Filter employees by multiple conditions and extract names
//Salary greater than 40,000., Department is IT. ,Age greater than 25.
//[Amit, Vikas]
public class Question9 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 50000, "IT", 28),
				new Employee(2, "Rahul", 60000, "HR", 30), new Employee(3, "Ankit", 35000, "IT", 24),
				new Employee(4, "Vikas", 70000, "IT", 32), new Employee(5, "Rohit", 45000, "Finance", 29));

		employees.stream().filter(e -> e.getSalary() > 40000 && e.getDepartment().equals("IT") && e.getAge() > 25)
				.map(n -> n.getName()).toList().forEach(System.out::println);
	}

}
