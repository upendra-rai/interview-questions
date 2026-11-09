package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.List;

//1. Find the top 5 unique numbers in ascending order.
//[5, 10, 15, 20, 30]
public class Question1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 5, 10, 30, 20, 40, 15, 5, 50);
		
		List<Integer> output = numbers.stream().distinct().sorted().limit(5).toList();
		System.out.println(output);

	}

}
