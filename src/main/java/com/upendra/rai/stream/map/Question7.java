package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.upendra.rai.stream.filter.Employee;

//Increase every employee's salary by 10% and collect the updated salary values into a List.
public class Question7 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 40000), new Employee(2, "Rahul", 60000),
				new Employee(3, "Ankit", 80000));

		List<Employee> emps = employees.stream().map(emp -> {
			int tenper= emp.getSalary()*10/100;
			emp.setSalary(emp.getSalary()+tenper);
			return emp;
		}).collect(Collectors.toList());
		
		
		List<Employee> emps2 = employees.stream().map(emp -> {
			int tenper= emp.getSalary()*10/100;
			emp.setSalary(emp.getSalary()+tenper);
			return emp;
		}).collect(Collectors.toList());
		
		List<Integer>data2=employees.stream().map(e->e.getSalary()*10/100).toList();
		System.out.println(emps);

	}

}
