package com.upendra.rai.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q5. Sort names by length (descending).
//[SpringBoot, Hibernate, Java, SQL, AWS]
public class Question4 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "SpringBoot", "SQL", "Hibernate", "AWS");
		
		List<String> descnames =names.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
			System.out.println(descnames);
	}

}
