package com.nice.my_spring;

import lombok.Data;
import lombok.ToString;
import lombok.Value;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Hobbit {
    @InjectRandomInt(min = 7, max = 10)
    private int speed;

    @InjectRandomInt(min = 1, max = 4)
    private int power;


}
