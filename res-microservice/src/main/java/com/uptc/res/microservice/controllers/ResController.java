package com.uptc.res.microservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.res.microservice.models.Operation;

@RestController
@RequestMapping("/res")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Content-Type")
public class ResController {
	  @PostMapping
	    public double doOperation(@RequestBody Operation operation) {
	        return operation.getNumberA() - operation.getNumberB() ;
	    }
}
