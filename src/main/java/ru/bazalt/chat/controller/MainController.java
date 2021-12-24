package ru.bazalt.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "chat";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "This is hello text on /hello path. now is = " + LocalDateTime.now().toString();
    }
}
