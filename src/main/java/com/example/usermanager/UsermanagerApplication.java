package com.example.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagerApplication.class, args);
        System.out.println("Hurray! User Manager Application is Working.");
    }
}
