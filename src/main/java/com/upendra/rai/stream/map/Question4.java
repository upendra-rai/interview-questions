package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, multiply each number by 2.
public class Question4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

		List<Integer> output = numbers.stream().map(n -> n * 2).collect(Collectors.toList());

		System.out.println(output);

	}

}
