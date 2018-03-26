package com.nice.multithreading;

import lombok.Setter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */

public class OnePrinter implements Runnable {
    @Setter
    private boolean moreWorkToDo = true;

    @Override
    @SneakyThrows
    public void run() {
        while (moreWorkToDo) {
            System.out.println(1);
//            Thread.sleep(200);
        }
    }
}
