package com.upendra.rai.stream.filter;

import java.util.Arrays;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000), new Product(2, "Keyboard", 1500),
				new Product(3, "Mouse", 800), new Product(4, "Monitor", 4500), new Product(5, "Laptop", 55000));

		List<Product>data=products.stream().filter(prod -> prod.getPrice() >= 1000 && prod.getPrice() <= 5000).toList();
		for (Product p : data) {
			System.out.println(p.getName());
			
		}
	}

}
