package com.nice.quoters;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class NameFactory {
    private DataFactory dataFactory = new DataFactory();

    public String getRandomName() {
        return dataFactory.getName();

    }
}
