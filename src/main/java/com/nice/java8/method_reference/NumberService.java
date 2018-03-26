package com.nice.java8.method_reference;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class NumberService {
    @Setter
    private int num = 10;
    public void tapelTapel(int x) {
        System.out.println(x*num);
    }
}
