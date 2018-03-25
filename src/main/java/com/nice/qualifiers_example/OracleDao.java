package com.nice.qualifiers_example;

import lombok.SneakyThrows;

import javax.annotation.PreDestroy;

import static com.nice.qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@NiceRepo(ORACLE)
public class OracleDao implements Dao {
    @Override
    @SneakyThrows
    public void save() {
        Thread.sleep(100);
        System.out.println("Saving to ORACLE...");
    }

    @PreDestroy
    public void releaseResources() {
        System.out.println("connection was released....");
    }
}
