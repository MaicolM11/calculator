package com.uptc.res.microservice.controllers;

import com.uptc.res.microservice.models.Operation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/res")
public class ResController {
    
    @PostMapping
    public double doOperation(@RequestBody Operation operation) {
        return operation.getNumberA() - operation.getNumberB() ;
    }

}
