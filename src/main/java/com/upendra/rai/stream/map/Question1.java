package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Convert all names into uppercase using map().

public class Question1 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("amit", "rahul", "ankit", "vikas");
		
		names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
