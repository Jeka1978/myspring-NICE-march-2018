package com.nice.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        //50 lines of code
        return "<html> Welcome new Client!</html>";
    }

    @Override
    public int myCode() {
        return 1;
    }
}
