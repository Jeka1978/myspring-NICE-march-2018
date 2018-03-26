package com.nice.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class FireEmployeeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        //60 lines of code
        return "<html>You are fired<html>";
    }

    @Override
    public int myCode() {
        return 4;
    }
}
