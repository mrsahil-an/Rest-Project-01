package com.belenits.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public ResponseEntity<?> getStudent()
    {
        String message = "Welcome to Rest API Project...............";
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
