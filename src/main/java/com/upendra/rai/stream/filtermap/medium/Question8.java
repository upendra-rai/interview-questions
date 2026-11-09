package com.upendra.rai.stream.filtermap.medium;

import java.util.Arrays;
import java.util.List;

//- Find transactions with status SUCCESS.- Amount must be greater than 5,000.
//- Convert them into TransactionDTO.- DTO should contain transactionId and amount.
//==TXN102 - 10000.0, TXN104 - 8000.0

public class Question8 {
	public static void main(String[] args) {

		List<Transaction> transactions = Arrays.asList(new Transaction(1, "TXN101", 2000, "SUCCESS", "UPI"),
				new Transaction(2, "TXN102", 10000, "SUCCESS", "CARD"),
				new Transaction(3, "TXN103", 15000, "FAILED", "UPI"),
				new Transaction(4, "TXN104", 8000, "SUCCESS", "NETBANKING"),
				new Transaction(5, "TXN105", 3000, "PENDING", "CARD"));

		transactions.stream().filter(t -> t.getStatus().equals("SUCCESS") && t.getAmount() > 5000).map(p -> {
			return new Transactiondto(p.getTransactionId(), p.getAmount());
		}).toList().forEach(System.out::println);

	}

}
