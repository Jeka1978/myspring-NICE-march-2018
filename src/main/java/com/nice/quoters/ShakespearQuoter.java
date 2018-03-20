package com.nice.quoters;

import com.nice.my_spring.InjectRandomInt;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Setter
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
