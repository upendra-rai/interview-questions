package com.upendra.rai.stream.filtermap.medium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private int id;
    private String transactionId;
    private double amount;
    private String status;
    private String paymentMode;
}