package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class FindGreater50 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 50, 60, 75, 90, 100);
		List<Integer>data=numbers.stream().filter(n->n>50).toList();
		System.out.println(data);
		
	}

}
