package com.springboot.dependencyInjection.common;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Without component annotation it won't behave like spring bean and the controller do not know that 
 * the class with the name swimCoach even exist.
 * Secondly, We will use configuration annotation and bean annotation to make it spring bean.
 * This class we can treat as third party application. Now how to include it in our spring application 
 * we will going to create a configuration class and describe bean method there and create an instance from there.
 */
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }
}