package com.ltri.feignapi.controller;

import com.ltri.feignapi.entity.User;
import com.ltri.feignapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private UserService userService;


    @GetMapping("/feign/users")
    public List<User> listUser() {
        return userService.listUser();
    }

    @GetMapping("/feign/details")
    public String getDetails() {
        return "success port:" + port;
    }

    @GetMapping("/feign/exception")
    public String exception() {
        return userService.exception();
    }


}
