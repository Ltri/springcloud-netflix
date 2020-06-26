package com.ltri.userapi.controller;

import com.ltri.userapi.entity.User;
import com.ltri.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Value("${server.port}")
    private Integer port;

    @Autowired
    private UserService userService;

    @GetMapping("/users/detail")
    public String detail() {
        return "success port:" + port;
    }

    @GetMapping("/users")
    public List<User> listUser() {
        return userService.list();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/users")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
        return userService.removeById(id);
    }

    @GetMapping("/users/exception")
    public String exception() {
        int i = 1 / 0;
        return "exception port:" + port;
    }

}
