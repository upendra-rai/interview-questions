package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q2. Sort numbers in descending order.
//[80, 60, 50, 30, 20, 10]
public class Question1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 30, 60);
		
		List<Integer> descNum =numbers.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(descNum);

	}

}
