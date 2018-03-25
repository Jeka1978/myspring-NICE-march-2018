package com.nice.quoters;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class NameFactory {
    private DataFactory dataFactory = new DataFactory();

    public String getRandomName() {
        return dataFactory.getName();

    }
}
