package com.example.RentABus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationsController {
    @GetMapping("/reservations")
    public String getReservations() {
        return "Reservations";
    }
}
