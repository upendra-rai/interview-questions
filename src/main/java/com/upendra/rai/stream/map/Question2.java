package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert all names into lowercase.

public class Question2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("JAVA", "SPRING", "HIBERNATE", "MYSQL");
		names.stream().map(n -> n.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
