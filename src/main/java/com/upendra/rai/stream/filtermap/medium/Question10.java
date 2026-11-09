package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//10. Filter products and generate a custom response
//Category must be Electronics., Price must be greater than 10,000.
//Quantity must be greater than 5., - Return a formatted String:

public class Question10 {
	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000, "Electronics", 10),
				new Product(2, "Keyboard", 1500, "Accessories", 20), new Product(3, "Mouse", 800, "Accessories", 30),
				new Product(4, "Laptop", 55000, "Electronics", 5), new Product(5, "Monitor", 12000, "Electronics", 8));

		products.stream()
				.filter(p -> p.getCategory().equals("Electronics") && p.getPrice() > 10000 && p.getQuantity() > 5)
				.map(p -> String.valueOf(p.getName() + " | " + p.getPrice() + " | " + p.getQuantity())).toList()
				.forEach(System.out::println);

	}

}
