package com.uptc.sum.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SumMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SusMicroserviceApplication.class, args);
	}

}
