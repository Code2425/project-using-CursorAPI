package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // This is a health check endpoint
    @GetMapping("/health")
    public String health() {
        return "service is up";
    }
}
