package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//5. Find the first 3 unique names sorted by length.
//[SQL, Java, Boot]

public class Question5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Boot", "Hibernate", "Java", "SQL", "Microservices",
				"Boot");

		List<String> names3 = names.stream().distinct().sorted(Comparator.comparingInt(String::length)).limit(3)
				.toList();
		System.out.println(names3);

	}

}
