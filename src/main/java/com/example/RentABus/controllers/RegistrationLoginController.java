package com.example.RentABus.controllers;

import com.example.RentABus.entities.Users;
import com.example.RentABus.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RegistrationLoginController {

    private final UserService userService;

    public RegistrationLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/RegistrationForm")
    public String getHome() {
        return "RegistrationForm";
    }
//    @PostMapping("/register")
//    public RedirectView getRegister(@ModelAttribute Users user) {
//        userService.saveUser(user);
//        return new RedirectView("/");
//    }
}

