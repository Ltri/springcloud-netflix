package com.ltri.hystrixapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class HystrixService {

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hystrixService(String name) {
        return "hystrix-" + name;
    }

    public String hystrixError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
