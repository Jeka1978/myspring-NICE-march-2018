package com.nice.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }
}
