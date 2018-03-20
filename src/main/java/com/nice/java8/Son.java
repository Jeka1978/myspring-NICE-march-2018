package com.nice.java8;

/**
 * @author Evgeny Borisov
 */
public class Son implements Mother, Father {
    @Override
    public void callSon() {
        Mother.super.callSon();
    }
}
