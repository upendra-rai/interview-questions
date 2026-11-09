package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Spring", "Boot");

		List<String>chars=words.stream().flatMap(word -> Arrays.stream(word.split(""))).toList();
		System.out.println(chars);
	}

}
