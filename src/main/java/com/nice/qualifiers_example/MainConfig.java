package com.nice.qualifiers_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@ComponentScan
public class MainConfig {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConfig.class);
    }

}
