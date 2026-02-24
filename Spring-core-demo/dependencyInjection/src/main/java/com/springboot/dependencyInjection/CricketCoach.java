package com.springboot.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice for 35 minutes";
    }
}
