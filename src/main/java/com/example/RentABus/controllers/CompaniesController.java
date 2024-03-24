package com.example.RentABus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompaniesController {
    @GetMapping("/companies")
    public String getCompanies() {
        return "Companies";
    }
}
