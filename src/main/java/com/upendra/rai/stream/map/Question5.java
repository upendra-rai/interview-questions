package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert every integer into a String.
public class Question5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		List<String>output	=numbers.stream().map(n->String.valueOf(n)).collect(Collectors.toList());
		
		System.out.println(output);
	}
	
	

}
