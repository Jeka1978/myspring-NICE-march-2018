package com.nice.spring_and_executors;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {
    @SneakyThrows
    @Async("myPool")
    public void print(String message) {
        for (int i=0;i<15;i++){
            System.out.println(message);
            Thread.sleep(300);
        }
    }
}
