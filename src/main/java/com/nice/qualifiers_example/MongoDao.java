package com.nice.qualifiers_example;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import static com.nice.qualifiers_example.DBType.MONGO;

/**
 * @author Evgeny Borisov
 */
@NiceRepo(MONGO)
public class MongoDao implements Dao {
    @Override
    @SneakyThrows
    public void save() {
        System.out.println("Saving to MONGO...");
    }
}
