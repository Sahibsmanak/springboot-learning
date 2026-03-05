package com.springboot.dependencyInjection.common;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component

public class CricketCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice for 35 minutes";
    }
}
