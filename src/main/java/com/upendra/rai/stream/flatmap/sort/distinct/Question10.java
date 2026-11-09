package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question10 {

	public static void main(String[] args) {

		List<Transaction> transactions = Arrays.asList(new Transaction("TXN1", Arrays.asList(500.0, 1000.0, 2000.0)),
				new Transaction("TXN2", Arrays.asList(1000.0, 3000.0)),
				new Transaction("TXN3", Arrays.asList(500.0, 4000.0)));
		
		List<Double>amounts=transactions.stream().flatMap(tr->tr.getAmounts().stream()).distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(amounts);
	}

}
