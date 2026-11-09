package com.upendra.rai.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(new Order("ORD1", Arrays.asList(500.0, 1500.0, 2000.0)),
				new Order("ORD2", Arrays.asList(300.0, 2500.0)), new Order("ORD3", Arrays.asList(1000.0, 3500.0)));
		
		List<Double>data=orders.stream().flatMap(or->or.getAmounts().stream().filter(p->p>1000)).toList();
		System.out.println(data);
	}

}
