package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;

import com.upendra.rai.stream.filter.Employee;
import com.upendra.rai.stream.filter.Employeedto;

//Use map() to convert Employee objects into EmployeeDTO objects.
public class Question9 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 75000));

		List<Employeedto> dtos = employees.stream().map(emp -> {
			Employeedto dto = new Employeedto(emp.getId(), emp.getName(), emp.getSalary());
			return dto;
		}).toList();
		
		System.out.println(dtos);

	}

}
