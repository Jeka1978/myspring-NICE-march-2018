package com.nice.java8;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    default void callSon() {
        System.out.println("COME HERE!!!");
    }
}
