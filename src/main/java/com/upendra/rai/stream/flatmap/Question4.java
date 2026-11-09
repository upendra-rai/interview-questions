package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 4, 5, 6),
				Arrays.asList(5, 6, 7, 8));
		List<Integer> data = numbers.stream().flatMap(List::stream).toList();
		System.out.println(data);

	}

}
