package com.upendra.rai.stream.flatmap.sort.distinct;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	private String transactionId;
	private List<Double> amounts;
}