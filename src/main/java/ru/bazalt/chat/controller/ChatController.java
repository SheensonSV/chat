package ru.bazalt.chat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChatController {

    @GetMapping("/glob")
    public String getAllMessages(){
        return "glob";
    }
}
