package com.nice.qualifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.nice.qualifiers_example.DBType.MONGO;
import static com.nice.qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @NiceRepo(ORACLE)
    private Dao backupDao;
    @NiceRepo(MONGO)
    private Dao mainDao;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println("Working...");
        mainDao.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup() {
        backupDao.save();
    }
}






