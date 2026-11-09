package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.List;

//7. Find the top 5 unique products alphabetically.
//[Camera, Keyboard, Laptop, Monitor, Mouse]
public class Question7 {
	public static void main(String[] args) {

		List<String> products = Arrays.asList("Laptop", "Mobile", "Tablet", "Laptop", "Monitor", "Keyboard", "Mouse",
				"Mobile", "Printer", "Camera");
		
		List<String>pros=products.stream().distinct().sorted().limit(5).toList();
		System.out.println(pros);
	}

}
