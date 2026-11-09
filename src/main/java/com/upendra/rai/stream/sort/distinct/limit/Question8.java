package com.upendra.rai.stream.sort.distinct.limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//8. Find the top 3 highest unique transaction amounts.
//[5000.0, 4000.0, 3000.0]
public class Question8 {

	public static void main(String[] args) {

		List<Double> amounts = Arrays.asList(500.0, 1500.0, 2000.0, 1500.0, 3000.0, 4000.0, 2000.0, 5000.0);
		List<Double> amounts3=amounts.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println(amounts3);
		

	}

}
