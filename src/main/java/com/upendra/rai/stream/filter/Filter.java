package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> data = numbers.stream().filter(t -> t.equals(11)).toList();
		System.out.println(data);
	}

}
