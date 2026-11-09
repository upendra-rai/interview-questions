package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		List<List<String>> products = Arrays.asList(Arrays.asList("Laptop", "Mobile", "Mouse"),
				Arrays.asList("Keyboard", "Laptop", "Monitor"), Arrays.asList("Mobile", "Tablet", "Mouse"));

		List<String> prods = products.stream().flatMap(pro -> pro.stream()).distinct()
				.sorted(Comparator.comparing(String::length)).toList();
		System.out.println(prods);
	}

}
