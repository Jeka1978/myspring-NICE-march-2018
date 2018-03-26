package com.nice.multithreading;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */

public class TwoPrinter implements Runnable {
    @Override
    @SneakyThrows
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(2222);
//            Thread.sleep(200);
//            i++;
        }
    }
}
