package com.nice.multithreading;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        OnePrinter onePrinter = new OnePrinter();
        Thread t1 = new Thread(onePrinter,"one");
        Thread t2 = new Thread(new TwoPrinter(),"two");
        t2.setDaemon(true);
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onePrinter.setMoreWorkToDo(false);
        Thread.sleep(10);

        System.out.println(t1.isAlive());



    }
}
