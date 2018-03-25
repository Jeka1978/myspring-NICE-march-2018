package com.nice.quoters;

import com.nice.my_spring.InjectRandomInt;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Book
public class ShakespearQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
