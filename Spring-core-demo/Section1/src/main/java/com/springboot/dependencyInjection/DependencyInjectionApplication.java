package com.springboot.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// If we need to scan any other package which is not present in the base package then that 
// we need to add in the below format
@SpringBootApplication (
	scanBasePackages={"testing"}
)


public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

}
