package com.nice.my_spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

/**
 * @author Evgeny Borisov
 */

@Getter
@Wither
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
}
