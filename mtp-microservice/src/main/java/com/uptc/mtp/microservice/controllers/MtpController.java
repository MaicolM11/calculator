package com.uptc.mtp.microservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.mtp.microservice.models.Operation;

@RestController
@RequestMapping("/mtp")
public class MtpController {
	 @PostMapping
	    public double doOperation(@RequestBody Operation operation) {
	        return operation.getNumberA() - operation.getNumberB() ;
	    }
}
