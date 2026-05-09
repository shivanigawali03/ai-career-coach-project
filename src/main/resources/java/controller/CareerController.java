package com.seroter.azure_basic_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CareerController {

    @PostMapping("/career-recommend")
    public CareerResponse recommend(@RequestBody CareerRequest request) {
        return new CareerResponse("Test OK");
    }
}