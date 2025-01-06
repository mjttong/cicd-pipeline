package com.example.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/api")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok().body("hello");
    }
}
