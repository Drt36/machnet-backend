package com.springtask2.question1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public Calculator calculator() {
        return new Calculator();
    }
}
