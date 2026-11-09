package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//1. Filter even numbers and multiply by 2
//[20, 40, 60, 80]
public class Question2 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		List<Integer> output = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();
		System.out.println(output);

	}

}
