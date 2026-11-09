package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class EmpMain {
	public static void main(String[] args) {

		List<Emp> emps = Arrays.asList(new Emp(1, "Amit", 50000, "IT", 28), new Emp(2, "Rahul", 60000, "HR", 30),
				new Emp(3, "Ankit", 35000, "IT", 24), new Emp(4, "Vikas", 70000, "IT", 32));

		List<Emp>data=emps.stream().filter(emp -> emp.getSalary() > 40000 && emp.getDept().equals("IT")&& emp.getAge() > 25)
				.toList();
		System.out.println(data);
	}

}
