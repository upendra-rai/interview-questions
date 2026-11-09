package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//Find products whose price is greater than 1,000., Apply a 15% discount., 
//- Return product name and discounted price.
public class Question3 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000, "Electronics", 10),
				new Product(2, "Keyboard", 1500, "Accessories", 20), new Product(3, "Mouse", 800, "Accessories", 30),
				new Product(4, "Laptop", 55000, "Electronics", 5), new Product(5, "Monitor", 12000, "Electronics", 8));

		products.stream().filter(p -> p.getPrice() > 1000).map(p -> {
			double discountprice = p.getPrice() - p.getPrice() * 15 / 100;
			return String.valueOf(p.getName() + " - " + discountprice);
		}).toList().forEach(System.out::println);
	}

}
