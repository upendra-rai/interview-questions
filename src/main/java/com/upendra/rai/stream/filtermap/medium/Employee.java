package com.upendra.rai.stream.filtermap.medium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private int age;
    private boolean active;
}