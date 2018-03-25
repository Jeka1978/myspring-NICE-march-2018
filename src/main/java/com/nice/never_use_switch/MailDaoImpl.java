package com.nice.never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {
    private DataFactory dataFactory = new DataFactory();
    @Override
    public int getMailCode() {
        return dataFactory.getNumberBetween(1,3);
    }
}
