package com.nice.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        //50 lines of code
        return "<html> Welcome new Client!</html>";
    }
}
