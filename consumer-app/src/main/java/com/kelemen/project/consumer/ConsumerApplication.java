package com.kelemen.project.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(ConsumerApplication.class);
        app.run(args);
		System.out.println("helloWorld");
	}
}
