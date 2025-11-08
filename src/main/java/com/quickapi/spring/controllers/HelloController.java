package com.quickapi.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok(new HelloResponse("QuickAPI-Spring", "Hello, world!"));
    }

    record HelloResponse(String service, String message) { }
}