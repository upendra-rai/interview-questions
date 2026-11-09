package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//4. Filter strings with length greater than 4 and get their lengths
//[6, 9, 6]
public class Question4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL", "Python");
		names.stream().filter(n->n.length()>4).map(n->n.length()).toList().forEach(System.out::println);
	}

}
