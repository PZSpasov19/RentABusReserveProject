package com.example.RentABus.controllers;

import com.example.RentABus.services.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    private final AdminService adminService;


    /** @noinspection SpringJavaInjectionPointsAutowiringInspection*/
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admins")
    public String showAdmins(Model model) {
        model.addAttribute("admins", adminService.getAllAdmins());
        return "admins";
    }
}
