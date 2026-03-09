package com.springboot.dependencyInjection.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach () {
        System.out.println("Calling Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 20 minutes";
    }
}
