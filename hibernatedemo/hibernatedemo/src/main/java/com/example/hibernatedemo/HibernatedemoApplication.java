package com.example.hibernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLIneRunner(String[] args) {
		return runner -> {
			System.out.println("Hello World");
		};
	}
	


}
