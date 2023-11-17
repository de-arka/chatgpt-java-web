package com.app.gpt.chatgptjavaweb.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequest {

    private String model;
    private List<Message> messages;
    
}
