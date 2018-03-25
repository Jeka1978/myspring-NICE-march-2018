package com.nice.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MoneyService {
    @Autowired
    private PredictionService predictionService;

    public void doWork(String name) {
        if (predictionService.willSurviveTheWinter(name)) {
            System.out.println(name + " you will get your money ASAP");
        } else {
            System.out.println("rejected...");
        }
    }
}
