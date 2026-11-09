package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//5. Filter numbers and calculate cubes
//Find numbers divisible by both 3 and 5., Exclude numbers greater than 100.
//- Calculate the cube of the remaining numbers. [3375, 27000, 91125, 216000, 729000]
public class Question5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 20, 30, 45, 60, 90, 105, 150, 200);

		numbers.stream().filter(n -> n % 3 == 0 && n % 5 == 0 && n < 100).map(n -> n * n * n).toList()
				.forEach(System.out::println);
		;

	}

}
