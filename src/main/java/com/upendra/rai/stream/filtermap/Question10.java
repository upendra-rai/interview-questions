package com.upendra.rai.stream.filtermap;

import java.util.Arrays;
import java.util.List;

//10. Filter products by price and extract product names in uppercase
//Find products with prices between 1,000 and 10,000 (inclusive).
//Extract product names. , Convert names into uppercase.

//[KEYBOARD, MONITOR, HEADPHONES]
public class Question10 {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000), new Product(2, "Keyboard", 1500),
				new Product(3, "Mouse", 800), new Product(4, "Monitor", 4500), new Product(5, "Laptop", 55000),
				new Product(6, "Headphones", 3000));

		products.stream().filter(p -> p.getPrice() >= 1000 && p.getPrice() <= 10000).map(p -> p.getName().toUpperCase()).toList()
				.forEach(System.out::println);

	}

}
