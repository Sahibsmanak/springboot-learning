package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Go for tracking for 1 hour";
    }
}
