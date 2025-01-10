package com.example.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringstartApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringstartApplication.class, args);

		// creating object done by spring
		Alien a = context.getBean(Alien.class);
		a.code();
	}

}
