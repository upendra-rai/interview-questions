package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//. Filter products with available stock

//Quantity must be greater than zero., Price must be greater than 5,000.
//- Return product name and total inventory value.
public class Question7 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000, "Electronics", 10),
				new Product(2, "Keyboard", 1500, "Accessories", 20), new Product(3, "Mouse", 800, "Accessories", 30),
				new Product(4, "Laptop", 55000, "Electronics", 5), new Product(5, "Monitor", 12000, "Electronics", 8));

		products.stream().filter(p -> p.getQuantity() > 0 && p.getPrice() > 5000).map(p -> {
			return String.valueOf(p.getName() + " - " + p.getQuantity() * p.getPrice());
		}).toList().forEach(System.out::println);

	}

}
