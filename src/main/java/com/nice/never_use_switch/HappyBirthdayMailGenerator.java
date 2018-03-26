package com.nice.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "<html>Happy Birthday<html>";
    }

    @Override
    public int myCode() {
        return 3;
    }
}
