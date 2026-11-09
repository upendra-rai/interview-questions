package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class StartA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Rahul", "Ankit", "Vikas", "Ajay", "Rohit");
		List<String>data=names.stream().filter(n->n.startsWith("A")).toList();
		System.out.println(data);
	}

}
