package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(2, 5, 8, 10), Arrays.asList(4, 8, 12, 15),
				Arrays.asList(10, 14, 16, 20));

		List<Integer> data = numbers.stream().flatMap(n -> n.stream()).filter(n -> n % 2 == 0)
				.sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(data);
	}

}
