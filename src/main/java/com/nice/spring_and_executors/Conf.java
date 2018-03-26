package com.nice.spring_and_executors;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author Evgeny Borisov
 */
@EnableAsync
@Configuration
@ComponentScan
public class Conf {

    @Bean(name = "myPool")
    public Executor threadPoolTaskExecutor() {
        return Executors.newFixedThreadPool(2);
    }


    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        MyService service = context.getBean(MyService.class);
        service.print("111");
        Thread.sleep(1000);
        service.print("222");
        Thread.sleep(1000);
        service.print("333");
    }
}
