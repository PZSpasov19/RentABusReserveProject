package com.example.RentABus.controllers;

import com.example.RentABus.entities.Booking;
import com.example.RentABus.services.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {
    private final BookingService bookingService;


    /** @noinspection SpringJavaInjectionPointsAutowiringInspection*/
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public String showBookings(Model model) {
        model.addAttribute("bookings", bookingService.getAllBookings());
        return "bookings";
    }

    @PostMapping("/book")
    public String bookBus(@ModelAttribute Booking booking) {
        // Add logic to validate and process the booking
        bookingService.saveBooking(booking);
        return "redirect:/bookings";
    }
}
