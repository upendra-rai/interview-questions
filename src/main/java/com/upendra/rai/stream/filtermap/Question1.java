package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//2. Filter names starting with A and convert to uppercase
//[AMIT, ANKIT, AJAY]
public class Question1 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Amit", "Rahul", "Ankit", "Vikas", "Ajay", "Rohit");
		names.stream().filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).toList()
		.forEach(System.out::println);

	}

}
