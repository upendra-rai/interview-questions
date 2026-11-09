package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q4. Sort names by length (ascending).
//[SQL, Java, Boot, Spring, Microservices]
public class Question3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Spring", "Java", "Microservices", "SQL", "Boot");
		List<String> sortNames =names.stream().sorted(Comparator.comparing(String::length)).toList();
		System.out.println(sortNames);
		
	}

}
