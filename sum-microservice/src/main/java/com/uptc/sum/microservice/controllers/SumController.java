package com.uptc.sum.microservice.controllers;

import com.uptc.sum.microservice.models.Operation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Content-Type")
public class SumController {
    
    @PostMapping
    public double doOperation(@RequestBody Operation operation) {
        return operation.getNumberA() + operation.getNumberB() ;
    }

}
