package com.uptc.res.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ResMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResMicroserviceApplication.class, args);
	}

}
