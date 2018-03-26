package com.nice.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Service
public class MailSender {
    @Autowired
    private MailDao dao;


    private Map<Integer, MailGenerator> map = new HashMap<>();


    @Autowired
    public void initMap(List<MailGenerator> generators) {
        for (MailGenerator generator : generators) {
            int code = generator.myCode();
            if (map.containsKey(code)) {
                throw new RuntimeException(code + " already in use");
            }
            map.put(code, generator);
        }
    }


    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        int mailCode = dao.getMailCode();

        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " not supported");
        }
        String html = mailGenerator.generate();
        send(html);
    }

    private void send(String html) {
        System.out.println("html = " + html + " was sent to client");
    }
}
