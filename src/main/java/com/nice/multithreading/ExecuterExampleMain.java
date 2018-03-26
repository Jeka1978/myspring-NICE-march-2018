package com.nice.multithreading;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Evgeny Borisov
 */

public class ExecuterExampleMain {

    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> callable = new Callable<String>() {
            @Override
            @SneakyThrows
            public String call() throws Exception {
                Thread.sleep(1200);
                return "JAVA";
            }
        };


        Future<String> future = executorService.submit(callable);
        System.out.println(213);
        String s = future.get();
        System.out.println("**********");
        System.out.println("s = " + s);


    }
}
