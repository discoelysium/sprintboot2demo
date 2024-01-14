package org.example.guigu.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @RequestMapping("/welcome")
    public String welcomeIndex() {
        return "Hello World!";
    }
}
