package com.springboot.dependencyInjection.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach () {
        System.out.println("Calling Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
       return "Practice for 30 minutes";
    }
}
