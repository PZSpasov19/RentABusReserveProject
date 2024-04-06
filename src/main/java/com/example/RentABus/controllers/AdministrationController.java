package com.example.RentABus.controllers;

import com.example.RentABus.entities.Users;
import com.example.RentABus.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdministrationController {

    private final UserService userService;

    public AdministrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/administration")
    public String administrationHome(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "Administration";
    }

    @GetMapping("/administration/users/{id}")
    public String manageUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "AdministrationUser";
    }

    @PostMapping("/administration/users/{id}")
    public RedirectView editUser(@PathVariable Long id, @ModelAttribute Users user) {
        Users toBeEdited = userService.getById(id);
        if (toBeEdited != null) {
            toBeEdited.setFullName(user.getFullName());
            userService.saveUser(toBeEdited);
        }
        return new RedirectView("/administration");
    }

    @PostMapping("/administration/users/delete/{id}")
    public RedirectView deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return new RedirectView("/administration");
    }
}
