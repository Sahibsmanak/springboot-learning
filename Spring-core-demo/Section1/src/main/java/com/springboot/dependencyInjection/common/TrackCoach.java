package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach () {
        System.out.println("Calling Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Go for tracking for 1 hour";
    }
}
