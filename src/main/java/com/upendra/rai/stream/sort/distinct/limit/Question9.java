package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.List;

//9. Find the first 5 unique cities alphabetically.
//[Bangalore, Chennai, Delhi, Hyderabad, Jaipur]
public class Question9 {
	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Bangalore", "Delhi", "Mumbai", "Chennai", "Delhi", "Pune", "Hyderabad",
				"Bangalore", "Kolkata", "Jaipur");

		List<String> cities5 =cities.stream().distinct().sorted().limit(5).toList();
		System.out.println(cities5);
	}

}
