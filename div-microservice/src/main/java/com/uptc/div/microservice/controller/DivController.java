package com.uptc.div.microservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.div.microservice.models.Operation;

@RestController
@RequestMapping("/div")
public class DivController {
	  @PostMapping
	    public double doOperation(@RequestBody Operation operation) {
	        return operation.getNumberA() / operation.getNumberB() ;
	    }
}
