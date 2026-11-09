package com.upendra.rai.stream.map;

import java.util.Arrays;
import java.util.List;

import com.upendra.rai.stream.filter.Product;

//Use map() to convert each product into a String containing its name and price.
public class Question8 {
	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product(1, "Mobile", 15000), new Product(2, "Laptop", 55000),
				new Product(3, "Keyboard", 1500));
		
		List<String>pr=products.stream().map(p->(p.getName()+" - "+p.getPrice())).toList();
		
		System.out.println(pr);

	}

}
