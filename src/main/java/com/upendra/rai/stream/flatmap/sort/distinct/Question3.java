package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {

		List<String> sentences = Arrays.asList("java is powerful", "spring is powerful", "java is popular");
		List<String> output = sentences.stream().flatMap(w -> Arrays.stream(w.split(" "))).distinct().sorted().toList();
		System.out.println(output);
	}

}
