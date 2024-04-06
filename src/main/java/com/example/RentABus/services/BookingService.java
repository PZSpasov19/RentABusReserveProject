package com.example.RentABus.services;

import com.example.RentABus.entities.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking getBookingById(Long id);
    void saveBooking(Booking booking);
}
