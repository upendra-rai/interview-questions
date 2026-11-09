package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, filter numbers that are greater than 10 and less than 100.

//Output- [15, 20, 50]
public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 50, 100, 150, 200);
		List<Integer>data=numbers.stream().filter(num->num>10&& num<100).toList();
		System.out.println(data);
	}

}
