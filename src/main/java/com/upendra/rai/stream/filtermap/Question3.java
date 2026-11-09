package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//3. Filter numbers greater than 50 and calculate their squares
//[3600, 5625, 8100, 10000]
public class Question3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 50, 60, 75, 90, 100);
		numbers.stream().filter(n->n>50).map(n->n*n).toList().forEach(System.out::println);
	}

}
