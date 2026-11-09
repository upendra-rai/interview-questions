package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//5. Filter odd numbers and convert them into strings
//["1", "3", "5", "7", "9"]
public class Question5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.stream().filter(n->n%2!=0).map(n->String.valueOf(n)).toList().forEach(System.out::println);

	}

}
