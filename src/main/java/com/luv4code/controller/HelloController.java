package com.luv4code.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> wish() {
        return ResponseEntity.ok("Hello CI/CD with Jenkins");
    }

    @GetMapping("/greet/{country}")
    public ResponseEntity<String> greet(@PathVariable String country){
        return ResponseEntity.ok("Hello, Welcome to "+country);
    }

}
