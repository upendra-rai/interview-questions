package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.List;

//3. Find the first 5 unique words in alphabetical order.
//[Amit, Ankit, Deepak, Karan, Rahul]
public class Question3 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rahul", "Amit", "Vikas", "Rahul", "Deepak", "Amit", "Karan", "Ankit",
				"Rohit");
		
		List<String> names5 =names.stream().distinct().sorted().limit(5).toList();
		
		System.out.println(names5);
	}

}
