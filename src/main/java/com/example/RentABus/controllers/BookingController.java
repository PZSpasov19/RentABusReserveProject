package com.example.RentABus.controllers;

import com.example.RentABus.entities.Admins;
import com.example.RentABus.entities.Booking;
import com.example.RentABus.entities.Users;
import com.example.RentABus.services.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookingController {
    private final BookingService bookingService;


    /** @noinspection SpringJavaInjectionPointsAutowiringInspection*/
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public String showBookings(Model model) {
        List<Booking> bookings = bookingService.getAllBookings();
        System.out.println("Number of bookings: " + bookings.size());
        model.addAttribute("bookings", bookings);
        return "bookings";
    }

    @PostMapping("/book")
    public String bookBus(@ModelAttribute Booking booking) {
        try {
            Users users = (Users) authentication.getPrincipal();
            booking.setUser(users);
        } catch (ClassCastException classCastException) {

        }

        try {
            Admins admin = (Admins) authentication.getPrincipal();
            booking.setAdmin(admin);
        } catch (ClassCastException classCastException) {

        }


        bookingService.saveBooking(booking);
        return "redirect:/companies";
    }

    @PostMapping("/bookings/{id}")

    public String updateBooking(@PathVariable Long id, @ModelAttribute("booking") Booking booking, Model model) {

        Booking existingBooking = bookingService.getBookingById(id);

        existingBooking.setUser(booking.getUser());

        existingBooking.setAdmin(booking.getAdmin());

        existingBooking.setBusCompany(booking.getBusCompany());

        existingBooking.setBusType(booking.getBusType());

        existingBooking.setDepartureDate(booking.getDepartureDate());

        existingBooking.setReturnDate(booking.getReturnDate());

        existingBooking.setTotalPassengers(booking.getTotalPassengers());

        existingBooking.setTotalCost(booking.getTotalCost());

        bookingService.saveBooking(existingBooking);

        System.out.println("Updated booking: " + existingBooking.getBookingId());

        return "redirect:/bookings";

    }


    @GetMapping("/bookings/{id}/delete")

    public String deleteBooking(@PathVariable Long id, Model model) {

        Booking booking = bookingService.getBookingById(id);

        bookingService.deleteBooking(booking);

        System.out.println("Deleted booking: " + booking.getBookingId());

        return "redirect:/bookings";

    }

}



