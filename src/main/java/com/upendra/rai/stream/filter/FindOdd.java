package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class FindOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer>data=numbers.stream().filter(n -> n % 2 != 0).toList();

		System.out.println(data);
	}

}
