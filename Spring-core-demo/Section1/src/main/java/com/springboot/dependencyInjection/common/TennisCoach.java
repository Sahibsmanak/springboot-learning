package com.springboot.dependencyInjection.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 30 Minutes";
    }
}
