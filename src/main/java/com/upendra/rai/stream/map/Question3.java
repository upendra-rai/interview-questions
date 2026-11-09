package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Return the length of every string using map().
public class Question3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL");

		List<Integer>data=names.stream().map(n -> n.length()).collect(Collectors.toList());
		
		System.out.println(data);
	}

}
