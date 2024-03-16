package com.example.RentABus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class est {
    @GetMapping(path = "/hello")
    public String h(){
        return "working";
    }
}
