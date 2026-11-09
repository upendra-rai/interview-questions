package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class Salary {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 75000), new Employee(4, "Vikas", 45000));
		 
		int salTag=50000;
		
		List<Employee>emps=employees.stream().filter(emp->emp.getSalary()>salTag).toList();
		System.out.println(emps);
	}

}
