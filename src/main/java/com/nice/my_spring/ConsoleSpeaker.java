package com.nice.my_spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void sayMessage(String message) {
        System.out.println(message);
    }
}
