package com.example.RentABus.controllers;

import com.example.RentABus.entities.Users;
import com.example.RentABus.services.AdminService;
import com.example.RentABus.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    private final AdminService adminService;
    private final UserService userService;


    /** @noinspection SpringJavaInjectionPointsAutowiringInspection*/
    public AdminController(AdminService adminService, UserService userService) {
        this.adminService = adminService;
        this.userService = userService;
    }

    @GetMapping("/admins")
    public String showAdmins(Model model) {
        model.addAttribute("admins", adminService.getAllAdmins());
        return "admins";
    }



}
