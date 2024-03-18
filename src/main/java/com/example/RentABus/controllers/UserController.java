package com.example.RentABus.controllers;

import com.example.RentABus.entities.Users;
import com.example.RentABus.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    /** @noinspection SpringJavaInjectionPointsAutowiringInspection*/
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Users user) {
        // Add login logic here
        return "redirect:/buses";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Users user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
}
