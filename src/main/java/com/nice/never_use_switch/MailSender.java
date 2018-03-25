package com.nice.never_use_switch;

/**
 * @author Evgeny Borisov
 */

public class MailSender {
    private MailDao dao = new MailDaoImpl();

    public void sendMail() {
        int mailCode = dao.getMailCode();
        switch (mailCode) {
            case 1:
                // 50 lines of code
                System.out.println("Welcome new client");
                break;
            case 2:
                System.out.println("don't call us we call you");
                //70 lines of code
                break;
        }
    }
}
