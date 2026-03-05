package com.springboot.dependencyInjection.common;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Prototype means for each calling of the bean the instance would be different. In singleton we use the same 
 * variables accross multiple initialization of this bean. 
 */
@Component
//This is the line which is making scope singleton or protoype. Comment the below line to see the changes
// You will see true which means both the objects sharing the same instance of this bean.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 
public class CricketCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice for 35 minutes";
    }
}
