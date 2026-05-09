package com.seroter.azure_basic_app.service;

import com.seroter.azure_basic_app.entity.User;
import com.seroter.azure_basic_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}