package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 20 minutes";
    }
}
