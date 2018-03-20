package com.nice.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.close();
    }
}
