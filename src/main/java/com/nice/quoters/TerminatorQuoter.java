package com.nice.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Film
public class TerminatorQuoter implements Quoter {
    private List<String> messages = new ArrayList<>();


    @Autowired
    public void setMessages(@Value("${terminator}") String messages,
                            @Value("${JAVA_HOME}") String javaHome,
                            String randomName) {
        this.messages.addAll(Arrays.asList(messages.split(",")));
        this.messages.add(javaHome);
        this.messages.add(randomName);


    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll() {
        System.out.println("You are teminated....");
    }
}
