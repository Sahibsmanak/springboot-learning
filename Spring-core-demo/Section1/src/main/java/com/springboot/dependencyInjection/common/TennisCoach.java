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

/**
 * with the help of these below annotations we can modify bean lifesyle like after initialization and destroying 
 * we can manually add our functions like some business logics or database functions and so on...
 * To test this start the application and end the same to check the sysout statements in the terminal.
 */
    @PostConstruct
    public void preConstructMethod() {
        System.out.println("Function after initialization is being called");
    }

    @PreDestroy
    public void preDestroyMethod() {
         System.out.println("Function before Destroying is being called");
    }
}
