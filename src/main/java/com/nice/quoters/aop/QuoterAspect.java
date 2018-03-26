package com.nice.quoters.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* com.nice..*.say*(..))")
    public void handleSayMethods() {
        System.out.print("THis is quote: ");
    }








}
