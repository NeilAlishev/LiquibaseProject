package com.example.LiquibaseProject.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.LiquibaseProject")
public class LiquibaseProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseProjectApplication.class, args);
    }
}
