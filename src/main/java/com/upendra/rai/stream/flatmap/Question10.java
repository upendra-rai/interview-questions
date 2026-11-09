package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question10 {
	public static void main(String[] args) {

		List<Customer> customers = Arrays.asList(
				new Customer("John",
						Arrays.asList(Arrays.asList("Laptop", "Mobile"), Arrays.asList("Mouse", "Keyboard"))),
				new Customer("David",
						Arrays.asList(Arrays.asList("Laptop", "Monitor"), Arrays.asList("Mobile", "Headphones"))),
				new Customer("Alex", Arrays.asList(Arrays.asList("Mouse", "Laptop"))));
		List<String> data = customers.stream().flatMap(c -> c.getPurchasedProducts().stream().flatMap(List::stream))
				.distinct().sorted().toList();
		System.out.println(data);

	}

}
