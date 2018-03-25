package com.nice.qualifiers_example;

/**
 * @author Evgeny Borisov
 */

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

@Component
public class ContextTerminator implements ContextTerminatorMBean {
    @Autowired
    private AnnotationConfigApplicationContext context;

    @PostConstruct
    @SneakyThrows
    public void registerAsMBean() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(this, new ObjectName("NICE MBEANS", "name", "Context-Terminator"));
    }

    @Override
    public void close() {
        context.close();
    }
}





