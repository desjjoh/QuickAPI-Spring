package com.quickapi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickapiSpringApplication {
    public static void main(String[] args) {
        // the class itself is passed in (QuickapiSpringApplication.class) so Spring knows the root package for component scanning and configuration.
        SpringApplication.run(QuickapiSpringApplication.class, args);
    }
}