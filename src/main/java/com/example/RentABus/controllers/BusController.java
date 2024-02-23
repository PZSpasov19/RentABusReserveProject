package com.example.RentABus.controllers;

import com.example.RentABus.models.Bus;
import com.example.RentABus.services.BusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping("/buses")
    public String getAllBuses(Model model) {
        List<Bus> buses = busService.getAllBuses();
        model.addAttribute("buses", buses);
        return "buses";
    }

    @GetMapping("/rent/{id}")
    public String rentBus(@PathVariable Long id) {
        busService.rentBus(id);
        return "redirect:/buses";
    }
}
