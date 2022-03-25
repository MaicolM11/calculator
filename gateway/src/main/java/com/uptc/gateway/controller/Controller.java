package com.uptc.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Value("${server.port}")
    private int serverPort;

    public static String BASE_URL = "http://localhost:";

    @PostMapping
    public double doOperation(@RequestBody Operation operation) {
        String path = "";
        switch (operation.getOperation()) {
            case "+":
                path = "/sum";
                break;
            case "-":
                path = "/res";
                break;
            case "/":
                path = "/div";
                break;
        }
        return doRequest(path, operation);
    }

    private double doRequest(String path, Operation data) {
        System.out.println(path);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Operation> request = new HttpEntity<>(data, headers);
        System.out.println(BASE_URL+ serverPort + path);
        return restTemplate.postForObject(BASE_URL+ serverPort + path, request, Double.class);
    }

}
