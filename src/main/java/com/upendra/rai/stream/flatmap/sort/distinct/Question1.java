package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(10, 5, 20, 10), Arrays.asList(15, 5, 30),
				Arrays.asList(20, 40, 10));

		List<Integer> output = numbers.stream().flatMap(n -> n.stream()).distinct().sorted().toList();
		System.out.println(output);
	}

}
