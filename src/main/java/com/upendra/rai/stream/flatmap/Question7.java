package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		List<Category> categories = Arrays.asList(new Category("Electronics", Arrays.asList("Laptop", "Mobile")),
				new Category("Clothing", Arrays.asList("Shirt", "Jeans")),
				new Category("Furniture", Arrays.asList("Table", "Chair")));
		List<String> pros = categories.stream().flatMap(cat -> cat.getProducts().stream()).toList();
		System.out.println(pros);
	}

}
