package com.example.RentABus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookingFormController{
    @GetMapping("/BookingForm")
    public String getHome() {
        return "BookingForm";
    }
}
