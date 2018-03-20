package com.nice.my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Transactional
public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3, max = 6)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println(repeat);
    }


    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVvvvvvvvvvvvvvvvvvvv");
        }
    }
}
