package com.drclb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RController {

    @GetMapping("/test")
    public String getTestWord() {
        return "This is my test endpoint" + new Date();
    }
}
