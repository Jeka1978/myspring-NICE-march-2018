package com.nice.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("WINTER_IS_COMING")
//spring.profiles.active
public class RegularPredictionService implements PredictionService {
    @Override
    public boolean willSurviveTheWinter(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
