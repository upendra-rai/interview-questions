package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//4. Find the top 4 unique even numbers in descending order.
//[70, 60, 50, 40]
public class Question4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 25, 30, 12, 40, 50, 30, 60, 70, 50);
		List<Integer> numbers4 = numbers.stream().filter(n -> n % 2 == 0).sorted(Comparator.reverseOrder()).limit(4)
				.toList();
		System.out.println(numbers4);

	}

}
