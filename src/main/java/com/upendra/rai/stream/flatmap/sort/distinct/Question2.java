package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring", "boot");
		
		List<Character> output = words.stream().flatMap(w -> w.chars()
				.mapToObj(c -> (char) c)).distinct().sorted().toList();
				

		System.out.println(output);

	}

}
