package com.nice.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Setter
    @Film
    private List<Quoter> quoters;

    @EventListener(ContextClosedEvent.class)
    public void niceUpdateInfo() {
        System.out.println("Ask again from Henrix, to update spring version...");
    }

    @Override
    @PostConstruct
    public void talk() {
        System.out.println("size of quoter list: "+quoters.size());
        quoters.forEach(Quoter::sayQuote);
    }
}
