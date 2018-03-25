package com.nice.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        System.out.println("***********");
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(String.class));
        System.out.println("***********");
        context.close();
    }
}
