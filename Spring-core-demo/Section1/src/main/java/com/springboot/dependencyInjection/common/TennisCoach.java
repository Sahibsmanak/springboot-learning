package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 30 Minutes";
    }
}
