package com.example.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringinitApplication.class, args);
	}

}


/* ./mvnw test - this command compile, test, package and verify project in sequence */
/* ./mvnw compile - compile all code */
/* ./mvnw clean verify - clear target directory and verify all stuff */
/* ./mvnw spring-boot:run - running spring project by cmd and install all required dependency */