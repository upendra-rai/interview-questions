package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class FindEven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

		List<Integer>data=numbers.stream().filter(n -> n % 2 == 0).toList();

		System.out.println(data);
	}

}
