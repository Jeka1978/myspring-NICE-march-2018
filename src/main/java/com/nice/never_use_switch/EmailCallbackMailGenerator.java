package com.nice.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        //70 lines of code
        return "<html> Don't call us we call you </html>";
    }

    @Override
    public int myCode() {
        return 2;
    }
}
