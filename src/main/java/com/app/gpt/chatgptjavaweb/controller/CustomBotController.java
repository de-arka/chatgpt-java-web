package com.app.gpt.chatgptjavaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.gpt.chatgptjavaweb.dto.ChatGPTRequest;
import com.app.gpt.chatgptjavaweb.dto.ChatGPTResponse;

@RestController
@RequestMapping("/bot")
public class CustomBotController {

    @Value("${openai.api.url}")
    private String url;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/ask")
    public ChatGPTResponse chat(@RequestBody ChatGPTRequest request) {
        return restTemplate.postForObject(url, request, ChatGPTResponse.class);
    }
    
}
