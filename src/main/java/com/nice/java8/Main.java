package com.nice.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        ListUtil.forEachWithDelay(integers,800,x -> System.out.println(x) );
    }
}
