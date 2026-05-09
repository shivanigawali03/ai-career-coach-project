package com.seroter.azure_basic_app.controller;

import com.seroter.azure_basic_app.entity.User;
import com.seroter.azure_basic_app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return testService.saveUser(user);

    }
}