package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q3. Sort names alphabetically.
//[Amit, Deepak, Karan, Rahul, Vikas]
public class Question2 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rahul", "Amit", "Vikas", "Deepak", "Karan");
		
		List<String> sortName=names.stream().sorted().toList();
		
		System.out.println(sortName);
		

	}

}
