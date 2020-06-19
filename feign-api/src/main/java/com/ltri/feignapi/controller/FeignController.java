package com.ltri.feignapi.controller;

import com.ltri.feignapi.entity.User;
import com.ltri.feignapi.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    private UserFeignService userFeignService;


    @GetMapping("/feign/users")
    public List<User> listUser() {
        return userFeignService.listUser();
    }


}
