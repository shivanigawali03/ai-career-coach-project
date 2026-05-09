package com.seroter.azure_basic_app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/chat")
public class ChatController {

    @PostMapping
    public Map<String, String> chat(@RequestBody Map<String, String> body) {

        String question = body.get("question");

        Map<String, String> response = new HashMap<>();

        if(question == null || question.isEmpty()) {
            response.put("answer", "Please ask a question");
            return response;
        }

        question = question.toLowerCase();

        if(question.contains("java")) {
            response.put("answer",
                    "Learn Core Java, Spring Boot, SQL and projects.");
        }

        else if(question.contains("python")) {
            response.put("answer",
                    "Learn Python, Django and APIs.");
        }

        else {
            response.put("answer",
                    "Build skills and practice projects.");
        }

        return response;
    }
}