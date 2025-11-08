package com.quickapi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.quickapi.spring.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class QuickapiSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickapiSpringApplication.class, args);
    }
}