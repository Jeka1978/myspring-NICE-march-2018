package com.nice.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainStreamToCollection {
    public static void main(String[] args) {

        Stream<Employee> employeeStream = Stream.of(
                new Employee("Jeka",10),
                new Employee("Shlomo",10),
                new Employee("Tamar",30),
                new Employee("Moshe",30),
                new Employee("Rivka",20));
        Map<Integer, List<Employee>> map =
                employeeStream.collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(map);
      /*  Stream<Integer> stream = Stream.of(1, 2, 3);
        List<Integer> list = stream.collect(Collectors.toList());*/
//        stream.collect(Collectors.toMap(o -> o.hashCode(), o -> o.getClass()));






    }
}
