package com.example.RentABus.services;

import com.example.RentABus.entities.Booking;

public interface BookingService {
    void saveBooking(Booking booking);

    Object getAllBookings();
}
