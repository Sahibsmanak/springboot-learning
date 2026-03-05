package com.springboot.dependencyInjection.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class SportConfig {

// BeanID which we use with qalifer would be the function name.
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}