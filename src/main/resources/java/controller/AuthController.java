package com.seroter.azure_basic_app.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.seroter.azure_basic_app.entity.User;
import com.seroter.azure_basic_app.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return authService.getUserById(id);
    }
}
