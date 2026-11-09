package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question3 {
	public static void main(String[] args) {

		List<String> sentences = Arrays.asList("Java is powerful", "Spring Boot is popular",
				"Microservices are scalable");
		List<String> data = sentences.stream().flatMap(word -> Arrays.stream(word.split(" "))).toList();
		System.out.println(data);
	}

}
