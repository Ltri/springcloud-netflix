package com.ltri.feignapi.service;

import com.ltri.feignapi.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "user-api", fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {

    @GetMapping("/users")
    List<User> listUser();

    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id);

    @GetMapping("/users/exception")
    String exception();
}
