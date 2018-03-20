package com.nice.java8;

/**
 * @author Evgeny Borisov
 */
public interface Father {
    default void callSon() {
        System.out.println("Come here");
    }
}
