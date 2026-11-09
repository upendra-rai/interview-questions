package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));
		numbers.stream().flatMap(List::stream).toList().forEach(System.out::println);

	}

}
