package com.nice.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Service
public class MailSender {
    @Autowired
    private MailDao dao;

    @Autowired
    private Map<String, MailGenerator> map;

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        String mailCode = String.valueOf(dao.getMailCode());
        MailGenerator mailGenerator = map.getOrDefault(mailCode, () -> {
            throw new RuntimeException(mailCode + " not supported");
        });
        String html = mailGenerator.generate();
        send(html);
    }

    private void send(String html) {
        System.out.println("html = " + html+" was sent to client");
    }
}
