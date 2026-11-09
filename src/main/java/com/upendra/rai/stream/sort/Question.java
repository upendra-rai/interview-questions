package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.List;


//Q1. Sort numbers in ascending order.
//[5, 10, 20, 30, 40, 50]
public class Question {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(50, 10, 30, 20, 40, 5);
		
		List<Integer> sortNum =numbers.stream().sorted().toList();
		
		System.out.println(sortNum);

	}

}
