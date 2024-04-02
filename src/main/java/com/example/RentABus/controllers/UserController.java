package com.example.RentABus.controllers;

import com.example.RentABus.entities.Users;
import com.example.RentABus.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute Users user) {
//
//        return "redirect:/buses";
//    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register")
    public RedirectView register(@ModelAttribute Users user) {
        userService.saveUser(user);
        return new RedirectView("/RegistrationForm");
    }
}
