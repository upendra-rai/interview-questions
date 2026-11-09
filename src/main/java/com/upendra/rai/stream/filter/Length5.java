package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class Length5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL", "Microservice");
		
		List<String>data=names.stream().filter(s->s.length()>5).toList();
		System.out.println(data);
		
	}

}
