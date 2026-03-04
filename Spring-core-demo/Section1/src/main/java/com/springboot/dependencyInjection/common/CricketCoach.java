package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice for 35 minutes";
    }
}
