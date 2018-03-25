package com.nice.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("WINTER_IS_HERE")
public class SeverePredictionService implements PredictionService {
    @Override
    public boolean willSurviveTheWinter(String name) {
        return name.toLowerCase().contains("lanister");
    }
}
