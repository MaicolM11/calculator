package com.uptc.mtp.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MtpMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtpMicroserviceApplication.class, args);
	}

}
