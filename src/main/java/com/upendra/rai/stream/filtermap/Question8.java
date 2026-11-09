package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//8. Filter employees older than 25 and convert into EmployeeDTO
//[EmployeeDTO(2, Rahul),EmployeeDTO(3, Ankit)]
public class Question8 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000, "IT", 24),
				new Employee(2, "Rahul", 60000, "HR", 28), new Employee(3, "Ankit", 75000, "IT", 30),
				new Employee(4, "Vikas", 50000, "Finance", 22));

		employees.stream().filter(n -> n.getAge() > 25).map(emp -> {
			EmployeeDTO dto = new EmployeeDTO(emp.getId(), emp.getName());
			return dto;
		}).forEach(System.out::println);

	}

}
