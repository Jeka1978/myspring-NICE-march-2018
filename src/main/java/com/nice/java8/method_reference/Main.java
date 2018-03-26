package com.nice.java8.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        NumberService numberService = new NumberService();

        integers.forEach(numberService::tapelTapel);
        numberService.setNum(200);

        integers.forEach(numberService::tapelTapel);
    }
}
