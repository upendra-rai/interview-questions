package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//2. Find the top 3 highest unique numbers.
//[400, 350, 300]
public class Question2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(100, 200, 150, 200, 300, 100, 400, 350);
		
		List<Integer> output =numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println(output);
		
	}

}
