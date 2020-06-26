package com.ltri.ribbonapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL = "http://USER-API/users/detail";


    @GetMapping("/ribbon/test")
    public String test() {
        return restTemplate.getForObject(REST_URL, String.class);
    }
}
