package com.nice.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        MoneyService moneyService = context.getBean(MoneyService.class);
        moneyService.doWork("therion lanister");
    }
}
