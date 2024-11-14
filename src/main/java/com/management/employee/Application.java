package com.management.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application. This class contains the main method which is used to launch the
 * application.
 */
@SpringBootApplication
public class Application {

    /**
     * The main method that serves as the starting point for the Spring Boot application.
     *
     * @param args command-line arguments passed during application startup
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
