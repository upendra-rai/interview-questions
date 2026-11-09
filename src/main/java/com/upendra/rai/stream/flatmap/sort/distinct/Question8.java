package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;

public class Question8 {

	public static void main(String[] args) {

		List<List<String>> emails = Arrays.asList(Arrays.asList("john@gmail.com", "alex@yahoo.com"),
				Arrays.asList("david@gmail.com", "sam@outlook.com"),
				Arrays.asList("raj@yahoo.com", "peter@outlook.com"));

		List<String> email = emails.stream().flatMap(List::stream).map(e -> e.split("@")[1]).distinct().sorted().toList();

		System.out.println(email);

	}

}
