package com.nice.java8.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        Optional<Integer> reduce = stream.reduce((a, b) -> a + b);
        System.out.println(reduce.orElseGet(() -> 0));
//        stream.map(x ->x*10 ).forEach(System.out::println);
//        Optional<Integer> any = stream.skip(40).findAny();
//        System.out.println(any.orElseGet());
//        stream.parallel().unordered().filter().filter().sequential().sorted()
//        stream.forEach(System.out::println);
//        stream.filter(x -> x % 2 == 0);


        Stream<Employee> employeeStream = Stream.of(new Employee(10), new Employee(20));
        int sum = employeeStream.mapToInt(Employee::getSalary).sum();
        System.out.println("sum = " + sum);


    }
}
